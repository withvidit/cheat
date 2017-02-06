import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
public static void main(String [] args)throws Exception {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter the values for FirstInnings");
	System.out.println("Enter the BattingTeam");
	String team1=br.readLine();
	System.out.println("Enter the runs scored");
	long runs1=Long.parseLong(br.readLine());
	System.out.println("Enter the values for SecondInnings");
	System.out.println("Enter the BattingTeam");
	String team2=br.readLine();
	System.out.println("Enter the runs scored");
	long runs2=Long.parseLong(br.readLine());
	
	Innings[] innings= new Innings[2];
	
	innings[0]= new Innings(team1, runs1);
	innings[1]= new Innings(team2, runs2);
	
	InningsBO bo= new InningsBO();
	bo.displayAllInningsDetails(innings);
	
}
}
