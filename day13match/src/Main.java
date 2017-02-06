import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the match date");
		String d=sc.nextLine();
		System.out.println("Enter the team one");
		String d1=sc.nextLine();
		System.out.println("Enter the team two");
		String d2=sc.nextLine();
		System.out.println("Enter the Venue");
		String d3=sc.nextLine();
		
		Match match = new Match(d, d1, d2, d3);
		
		System.out.println("Match Details\n"+match.toString());
		sc.close();
		
	}

}
