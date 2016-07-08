package br.ufsc.egc.sofitexreader;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;
import org.getopt.luke.DocReconstructor;
import org.getopt.luke.DocReconstructor.Reconstructed;
import org.getopt.luke.GrowableStringArray;

/**
 * Hello world!
 *
 */
public class FieldExplorerApp {
	
	public static void main(String[] args) {
		
		try {
			
			FSDirectory directory = FSDirectory.open(FileSystems.getDefault().getPath("index/mapa/pessoa"));
			DirectoryReader directoryReader = DirectoryReader.open(directory);
			IndexSearcher searcher = new IndexSearcher(directoryReader);
			
			TopDocs topDocs = searcher.search(new MatchAllDocsQuery(), Integer.MAX_VALUE);
			
			DocReconstructor reconstructor = new DocReconstructor(searcher.getIndexReader(), new String[]{"resume_lattes", "pessoa_thrift"}, -1);
			int i = 0;
			for (ScoreDoc scoreDoc: topDocs.scoreDocs) {
				Reconstructed reconstructed = reconstructor.reconstruct(scoreDoc.doc);
				Map<String, GrowableStringArray> map = reconstructed.getReconstructedFields() ;
				ArrayList<String> keyList = new ArrayList<String>(map.keySet());
				Collections.sort(keyList);
				for (String field: keyList) {
					System.out.println(field + "\t " + map.get(field).toString(" ").replaceAll("\n", " "));
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
