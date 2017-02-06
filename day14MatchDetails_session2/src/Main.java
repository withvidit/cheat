import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
public static void main(String[] args)throws Exception {
	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter the number of matches");
	int n= Integer.parseInt(br.readLine());
	String date,t1,t2,venue;
	
	Match[] matchList= new Match[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter match "+(i+1)+" details");
		System.out.println("Enter the match date");
		date=br.readLine();
		System.out.println("Enter the team one");
		t1=br.readLine();
		
		System.out.println("Enter the team two");
		t2=br.readLine();
		System.out.println("Enter the Venue");
		venue=br.readLine();
		matchList[i]= new Match(date, t1, t2, venue);
		
		
	}
	
	MatchBO bo= new MatchBO();
	bo.displayAllMatchDetails(matchList);
	
	System.out.println("Enter the date to be searched");
	String search= br.readLine();
	
	bo.displaySpecificMatchDetails(matchList, search);
}
}
