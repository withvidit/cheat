import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);

int n=sc.nextInt();

ArrayList<Integer> a= new ArrayList<Integer>();

for(int i=0;i<n;i++)
	a.add(sc.nextInt());

int sum=0,sum1=0;

for(int i=0;i<a.size();i++)
{
	if(a.get(i)!=7)
	{
		sum1=0;
		int y=a.get(i);
		while(y>0)
		{
			
			int x=y%10;
			if(x==5)
				sum1=0;
			else
			sum1+=x;
			y=y/10;
			//System.out.println(sum1);
		}
		sum+=sum1;
		//System.out.println(sum);
	}
}

System.out.println(sum);
	}

}
