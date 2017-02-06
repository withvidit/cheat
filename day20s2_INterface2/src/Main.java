import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Menu\n1.Crciket Player Details\n2.Hockey Player Details\nEnter choice");
		int n= Integer.parseInt(br.readLine());
		if(n!=1 && n!=2)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		System.out.println("Enter player name");
		String name=br.readLine();
		System.out.println("Enter team name");
		String team= br.readLine();
		System.out.println("Enter number of matches played");
		int matches=Integer.parseInt(br.readLine());
		
		switch(n)
		{
		case 1:
			System.out.println("Enter total runs scored");
			long runs=Long.parseLong(br.readLine());
			System.out.println("Enter total number of wickets taken");
			int wickets=Integer.parseInt(br.readLine());
			CricketPlayer cp= new CricketPlayer(name, team, matches, runs, wickets);
			cp.displayPlayerStatistics();
			break;
			
		case 2:
			System.out.println("Enter the position");
			String position=br.readLine();
			System.out.println("Enter total number of goals taken");
			int goals=Integer.parseInt(br.readLine());
			HockeyPlayer hp= new HockeyPlayer(name, team, matches, position, goals);
			hp.displayPlayerStatistics();
			break;
		default :
				
				break;
		}
		
	}

}
