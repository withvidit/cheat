import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number of teams:");
		int n= Integer.parseInt(br.readLine());
		ArrayList<Team> team= new ArrayList<Team>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter team "+(i+1)+" detail\nEnter Name");
			String name=br.readLine();
			System.out.println("Enter number of matches");
			long matches=Long.parseLong(br.readLine());
			//team[i]= new Team(name, matches);
			team.add(new Team(name, matches));
		}
		
		TeamComparator tc= new TeamComparator();
		
		Collections.sort(team, tc);
		System.out.println("Team list after sort by number of matches");
		Iterator<Team> it;
		it= team.iterator();
		 for(int i=0;i<team.size();i++){
				
			 System.out.println(it.next());
	}
	}

}
