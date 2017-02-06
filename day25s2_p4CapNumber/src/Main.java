import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number of players:");
		int n= Integer.parseInt(br.readLine());
		TreeSet<Player> h= new TreeSet<Player>();
		for(int i=0;i<n;i++){
			System.out.println("Enter player "+(i+1)+" detail");
			System.out.println("Enter Name");
			String name= br.readLine();
			System.out.println("Enter Skill");
			String Skill=br.readLine();
			
			System.out.println("Enter Cap Number");
			int score = Integer.parseInt(br.readLine());
			
			h.add(new Player(name,Skill,score));
			
			
		}
		
		System.out.println("Player list after sorting by cap number in descending order");
		
		Iterator<Player> iterator;
		iterator = h.descendingIterator();
		 for(int i=0;i<h.size();i++){
				
			 System.out.println(iterator.next());
	}
	}
	

}
