import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int halfc=0,cen=0;
		ArrayList<Integer> a= new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
			if(a.get(i)>=100)
				cen++;
			else if(a.get(i)>=50 && a.get(i)<100)
				halfc++;
				
		}
		
		System.out.println(halfc);
		System.out.println(cen);
		
	}

}
