import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter the number of matches");
	int n=Integer.parseInt(br.readLine());
	Outcome[] outcomeList= new Outcome[n];
	String date,status,win,pom;
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter match "+(i+1)+" details");
		System.out.println("Enter the date");
		date= br.readLine();
		System.out.println("Enter the status");
		status=br.readLine();
		System.out.println("Enter the winner team");
		win=br.readLine();
		System.out.println("Enter the player of match");
		pom=br.readLine();
		
		outcomeList[i]= new Outcome(date, status, win, pom);
	}
	
	OutcomeBO bo= new OutcomeBO();
	bo.displayAllOutcomeDetails(outcomeList);
	
	System.out.println("Enter the date to be searhed");
	String search= br.readLine();
	bo.displaySpecificOutcomeDetails(outcomeList, search);

	}

}
