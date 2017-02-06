import java.util.Scanner;



public class Main {
	
	
	public static boolean isprime(int n)
	{
		int x=0;
		if(n==1)
			return false;
		if(n==2)
			return true;
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					x=1;
					return false;
				}
			}
			
		}
		if(x==0)
		{
			return true;
		}
		else
			return false;
	}
public static void  main(String[] args)throws Exception {
	Scanner sc= new Scanner(System.in);
	
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	for(int i=a;i<=b;i++)
	{
		if(isprime(i))
		{
			System.out.print(i+" ");
		}
	}
	
	
	
}
}
