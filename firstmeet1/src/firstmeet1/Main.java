package firstmeet1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		if(n==2 || n==4)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		sc.close();
	}
}
