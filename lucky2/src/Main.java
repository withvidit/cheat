import java.util.Scanner;



public class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n,r,k;
		
		for(int i=a;i<=b;i++)
		{
			n=i;
			r=0;
			k=0;
			while(n>0)
			{
				k=n%10;
				r=r*10+k;
				n=n/10;
			}
			
			if(r==i)
			{
				System.out.print(i+" ");
			}
		}
		
	}
	

}
