import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==i)
					System.out.print(i);
				else
					System.out.print(0);
			}
			System.out.println("");
		}

	}

}
