import java.util.Scanner;


public class Main {
public static void main(String [] args) throws Exception {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		if(n%100==0)
		{
			if(n%400==0)
			System.out.println("Yes");
			else
				System.out.println("No");
		}
		else if(n%4==0)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	sc.close();	
	}

}
