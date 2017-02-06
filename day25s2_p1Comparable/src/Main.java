import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please provide the number of  players");
		int n= Integer.parseInt(br.readLine());
		TreeSet<Ranking> h= new TreeSet<Ranking>();
		for(int i=0;i<n;i++){
			System.out.println("Enter the name of the player "+(i+1));
			String name= br.readLine();
			System.out.println("Enter the score of the player "+(i+1));
			int score = Integer.parseInt(br.readLine());
			
			h.add(new Ranking(name, score));
			
			
		}
		
		System.out.println("Player Details by Score(High to Low)");
		
		Iterator<Ranking> iterator;
		iterator = h.descendingIterator();
		 for(int i=0;i<h.size();i++){
				
			 System.out.println((i+1)+""+iterator.next());
	}
	}

}
