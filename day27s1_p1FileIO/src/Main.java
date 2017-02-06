import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		int c=1;
		InputStream i=new FileInputStream(new File("matches.txt"));
		MatchFileStore mf=new MatchFileStore();
		List<Match> l=mf.obtainMatchFromFile(i);
		Match m= new Match();
		Iterator k=l.iterator();
		System.out.println("The Match Details are :");
		while(k.hasNext()){
			m.displayMatch((Match) k.next(),c);
			c++;
		}
		
	}
}
