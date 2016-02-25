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

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		try {
			
			FSDirectory directory = FSDirectory.open(FileSystems.getDefault().getPath("index/pessoa"));
			DirectoryReader directoryReader = DirectoryReader.open(directory);
			IndexSearcher searcher = new IndexSearcher(directoryReader);
			
			TopDocs topDocs = searcher.search(new MatchAllDocsQuery(), Integer.MAX_VALUE);
			
			for (ScoreDoc scoreDoc: topDocs.scoreDocs) {
				Document document = searcher.doc(scoreDoc.doc);
				System.out.println(document.getField("busca_cv"));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
