package br.org.stela.intelectus;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.Iterator;
import java.util.List;

import org.apache.lucene.index.BinaryDocValues;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.MultiDocValues;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;
import org.apache.thrift.TDeserializer;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.org.stela.intelectus.lattes.thrift.PalavraChave;
import br.org.stela.intelectus.service.thrift.PessoaDimensional;

public class IndexMiningLauncher {

	private static Logger logger = LoggerFactory
			.getLogger(IndexMiningLauncher.class);

	public static void main(String[] args) throws IOException, TException {
		
		File file = new File("saida.txt");
		
		if (file.exists()) {
			file.delete();
			file.createNewFile();
		}
		
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter writer = new BufferedWriter(fileWriter);
		
		IndexReader reader = DirectoryReader.open(FSDirectory.open(FileSystems
				.getDefault().getPath("./index/mapa/pessoa")));
		IndexSearcher searcher = new IndexSearcher(reader);

		TopDocs topDocs = searcher.search(new MatchAllDocsQuery(),
				Integer.MAX_VALUE);

		for (int i = 0; i < topDocs.scoreDocs.length; i++) {
			int docId = topDocs.scoreDocs[i].doc;

			BinaryDocValues resumeLattesField = MultiDocValues.getSortedValues(
					reader, "resume_lattes");
			BinaryDocValues pessoaThriftField = MultiDocValues.getBinaryValues(
					reader, "pessoa_thrift");

			String resumeLattes = new String(resumeLattesField.get(docId).bytes);
			PessoaDimensional pessoaDimensional = new PessoaDimensional();

			TDeserializer deserializer = new TDeserializer(
					new TBinaryProtocol.Factory());
			deserializer.deserialize(pessoaDimensional,
					pessoaThriftField.get(docId).bytes);

			List<PalavraChave> palavrasChave = pessoaDimensional
					.getPalavrasChave();

			StringBuilder builder = new StringBuilder();

			builder.append(String.valueOf(docId));
			if (!resumeLattes.trim().isEmpty()) {
				builder.append(" | ");
				builder.append(resumeLattes.trim());
			}

			if (palavrasChave != null) {
				Iterator<PalavraChave> itPalavrasChave = palavrasChave
						.iterator();
				if (itPalavrasChave.hasNext()) {
					builder.append(" | ");
					while (itPalavrasChave.hasNext()) {
						PalavraChave palavraChave = itPalavrasChave.next();
						builder.append(palavraChave.getNmePlvChave());
						if (itPalavrasChave.hasNext()) {
							builder.append(" | ");
						}
					}
				}
			}

			writer.write(builder.toString() + "\n");

		}
		
		reader.close();
		
		writer.close();
		fileWriter.close();
	}

}
