import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		String s= sc.nextLine();
		String[] s1=s.split(" ");
		if(UserMainCode.validatePlayer(s1[0], s1[1]))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		

	}

}
