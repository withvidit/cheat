import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter player name");
		String name=br.readLine();
		System.out.println("Enter team name");
		String team= br.readLine();
		System.out.println("Enter number of matches");
		long matches= Long.parseLong(br.readLine());
		System.out.println("Menu\n1.Bowler details\n2.Batsman details\nEnter choice");
		int ch= Integer.parseInt(br.readLine());
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter number of wicktes taken");
			long noOfW= Long.parseLong(br.readLine());
			Bowler bow = new Bowler(name, team, matches, noOfW);
			bow.displayDetails();
			break;
		case 2:
			System.out.println("Enter number of runs scored");
			long runs=Long.parseLong(br.readLine());
			Batsman bat= new Batsman(name, team, matches, runs);
			bat.displayDetails();
			break;
		}
		

	}

}
