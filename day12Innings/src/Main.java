import java.util.Scanner;


public class Main {
	public static void main(String[] args)throws Exception {
		
	
Scanner sc= new Scanner(System.in);
Innings ing= new Innings();
System.out.println("Enter the innings number");
ing.number= sc.nextLine();
System.out.println("Enter the BattingTeam");
ing.battingTeam= sc.nextLine();
System.out.println("Enter the runs scored");
ing.runs= sc.nextLong();


ing.displayInningsDetails();
sc.close();

	}
}
