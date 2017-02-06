import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat sdf= new SimpleDateFormat("MM-dd-yyyy");
		System.out.println("Enter the number of matches");
		int n= Integer.parseInt(br.readLine());
		TreeSet<Match> h= new TreeSet<Match>();
		for(int i=0;i<n;i++){
			System.out.println("Enter match date in (MM-dd-yyyy)");
			String s=br.readLine();
			Date dt= sdf.parse(s);
			System.out.println("Enter Team 1");
			String team1= br.readLine();
			System.out.println("Enter Team 2");
			String team2 = (br.readLine());
			
			h.add(new Match(dt, team1, team2));
			
			
		}
		
		System.out.println("Match Details");
		
		Iterator<Match> iterator;
		iterator = h.descendingIterator();
		 for(int i=0;i<h.size();i++){
				
			 System.out.println(iterator.next());
	}

	}

}
