import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static  boolean isPrime(int n)
	{
		if(n==2)
			return true;
		else if(n==1)
			return false;
		else 
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
					return false;
			}
		}
		
			return true;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of matches");
		int n=sc.nextInt();

		ArrayList<Integer> a= new ArrayList<Integer>();
		System.out.println("Enter the runs scored by the team");
		int count=0;
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
			if(isPrime(a.get(i)))
				count++;
		}
		System.out.println("Number of prime scores : "+count);

	}

}
