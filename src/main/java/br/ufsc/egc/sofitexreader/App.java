package br.ufsc.egc.sofitexreader;

import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.search.Collector;
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
		
		Object directoryReader = DirectoryReader.open(FSDirectory.open("index/pessoa"));
		IndexSearcher searcher = new IndexSearcher(directoryReader);
		
		TopDocs topDocs = searcher.search(new MatchAllDocsQuery(), Integer.MAX_VALUE);
		
	}
	
}
