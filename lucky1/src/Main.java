import java.util.Scanner;



public class Main {
	
	public static void main(String[] args)throws Exception {
		
		Scanner sc= new Scanner(System.in);
		
		int a= sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			int x=i;
			int count=0;
			
			while(x>0)
			{
				int y=x%10;
				if(y==2 || y==3 || y==5 || y==7)
					count++;
				x=x/10;
				
			}
			if(count==2)
				System.out.print(i+" ");
		}
		
	}

}
