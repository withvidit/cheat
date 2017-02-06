import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);

String x=sc.nextLine();

if(UserMainCode.validateTeam(x))
	System.out.println("Lucky");
else
	System.out.println("Unlucky");
	}

}
