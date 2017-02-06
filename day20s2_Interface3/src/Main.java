import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
		String s="";
		int choice =0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("Menu\n1.Bowler\n2.Batsman\n3.WicketKeeper\n4.AllRounder\nEnter your choice");
			choice = Integer.parseInt(br.readLine());
			
			while(choice!=1 &&choice!=2&& choice!=3&&choice!=4)
			{
				
				System.out.println("Please Enter a Valid Input");
				System.out.println("Menu\n1.Bowler\n2.Batsman\n3.WicketKeeper\n4.AllRounder\nEnter your choice");
				choice = Integer.parseInt(br.readLine());
				
			}
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Bowler details\nEnter player name");
				String name=br.readLine();
				System.out.println("Enter team name");
				String team=br.readLine();
				System.out.println("Enter number of matches played");
				int matches=Integer.parseInt(br.readLine());
				System.out.println("Enter number of wickets taken");
				int wickets=Integer.parseInt(br.readLine());
				Bowler bow= new Bowler(name, team, matches, wickets);
				//bow = new CricketPlayer(name, teamName, noOfMatches);
				bow.displayPlayerStatistics();
				break;
				
			case 2:
				System.out.println("Enter the Batsman details\nEnter player name");
				String name1=br.readLine();
				System.out.println("Enter team name");
				String team1=br.readLine();
				System.out.println("Enter number of matches played");
				int matches1=Integer.parseInt(br.readLine());
				System.out.println("Enter the runs scored");
				long runs1=Long.parseLong(br.readLine());
				Batsman bat= new Batsman(name1, team1, matches1, runs1);
				bat.displayPlayerStatistics();
				break;
				
			case 3:
				System.out.println("Enter the WicketKeeper details\nEnter player name");
				String name2=br.readLine();
				System.out.println("Enter team name");
				String team2=br.readLine();
				System.out.println("Enter number of matches played");
				int matches2=Integer.parseInt(br.readLine());
				System.out.println("Enter number of catches taken");
				int catches2=Integer.parseInt(br.readLine());
				System.out.println("Enter number of stumpings");
				int stumpings2=Integer.parseInt(br.readLine());
				System.out.println("Enter number of dismissals");
				int diss2=Integer.parseInt(br.readLine());
				System.out.println("Enter the runs scored");
				long runs2=Integer.parseInt(br.readLine());
				WicketKeeper wk= new WicketKeeper(name2, team2, matches2, catches2, stumpings2, runs2, diss2);
				wk.displayPlayerStatistics();
				break;
				
			case 4:
				System.out.println("Enter the AllRounder details\nEnter player name");
				String name3=br.readLine();
				System.out.println("Enter team name");
				String team3=br.readLine();
				System.out.println("Enter number of matches played");
				int matches3=Integer.parseInt(br.readLine());
				System.out.println("Enter the runs scored");
				long runs3= Long.parseLong(br.readLine());
				System.out.println("Enter number of wickets taken ");
				int wickets3=Integer.parseInt(br.readLine());
				AllRounder ar= new AllRounder(name3, team3, matches3, runs3, wickets3);
				ar.displayPlayerStatistics();
				
				break;
				
				default :
					break;
				
			}
			System.out.println("Do you want to continue?");
			s=br.readLine();
		}while(s.equals("YES"));

	}

}
