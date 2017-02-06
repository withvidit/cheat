import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
			if(i%2==0 && a.get(i)%2==0)
				sum+=a.get(i);
			if(i%2==1 && a.get(i)%2==1)
				sum+=a.get(i);
		}
		
		System.out.println(sum);
	}

}
