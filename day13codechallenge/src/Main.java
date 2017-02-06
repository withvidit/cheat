import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Main {

	public static void main(String[] args) throws Exception {
		//Scanner sc= new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] winner= new String[2];
		long[] score= new long[2];
		String[] pom= new String[2];
		Outcome[] p= new Outcome[2];
		
		
		
		
		
		
		for(int i=0;i<2;i++){
		System.out.println("Enter the outcome "+(i+1)+" details");
		System.out.println("Enter the winner team");
		winner[i]= br.readLine();
		
		System.out.println("Enter the score");
		score[i]= Long.parseLong(br.readLine());
		System.out.println("Enter the player of the match");
		pom[i]= br.readLine();
		
		p[i]= new Outcome(winner[i], score[i], pom[i]);
		//p[i].setWinnerTeam(winner[i]);
		//p[i].setScore(score[i]);
		//p[i].setPlayerOfMatch(pom[i]);
		//System.out.println(p[i].getWinnerTeam() + " --- " + p[i].getScore()+" --- "+p[i].getPlayerOfMatch());
		System.out.println(p[i]);
		}
		
		
		
		System.out.println(p[0].equals(p[1]));
		
		
	//	if(result)
		{
	//		System.out.println("Both the outcome details are same.");
		}
	//	else
		{
		//	System.out.println("Both the outcome details are different.");
		}
		

	}

}
