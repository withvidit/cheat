import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String s=sc.nextLine();
		String l= sc.nextLine();
		
		if(UserMainCode.validatePlayer(s, l))
		{
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");

	}

}
