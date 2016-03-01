package br.ufsc.egc.sofitexreader;

import java.io.IOException;
import java.nio.file.FileSystems;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;
import org.getopt.luke.DocReconstructor;
import org.getopt.luke.DocReconstructor.Reconstructed;

/**
 * Hello world!
 *
 */
public class BuscaCvExtractorApp {
	
	public static void main(String[] args) {
		
		try {
			
			FSDirectory directory = FSDirectory.open(FileSystems.getDefault().getPath("index/pessoa"));
			DirectoryReader directoryReader = DirectoryReader.open(directory);
			IndexSearcher searcher = new IndexSearcher(directoryReader);
			
			TopDocs topDocs = searcher.search(new MatchAllDocsQuery(), Integer.MAX_VALUE);
			
			DocReconstructor reconstructor = new DocReconstructor(searcher.getIndexReader());
			
			for (ScoreDoc scoreDoc: topDocs.scoreDocs) {
				Reconstructed reconstructed = reconstructor.reconstruct(scoreDoc.doc);
				System.out.println(reconstructed.getReconstructedFields().get("busca_cv").toString(" ").replace("null_1", "<PREP>"));
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
