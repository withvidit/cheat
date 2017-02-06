import java.util.Scanner;



public class Main {
	public static void main( String args[]) throws Exception {
		
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=0;
		for(int i=a;i<=b;i++)
		{
			int counte=0,counto=0;
			int y=i;
			while(y>0)
			{
			
				x=y%10;
				if(x!=0)
				{
				if(x%2==0)
				{
					counte++;
				}
				else if(x%2==1)
				{
					counto++;
				}
				}
				y=y/10;
			}
			
			if(counte==2 && counto==2)
			{
				System.out.print(i+" ");
			}
		}
		
	}
}
