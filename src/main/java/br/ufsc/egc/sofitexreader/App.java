package br.ufsc.egc.sofitexreader;

import java.io.IOException;
import java.nio.file.FileSystems;

import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.MatchAllDocsQuery;
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
			
			System.out.println(topDocs.totalHits);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
