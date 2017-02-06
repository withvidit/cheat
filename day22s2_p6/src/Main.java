import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new  Scanner(System.in);
		String s=sc.nextLine();
		
		if(UserMainCode.validateTeam(s))
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
