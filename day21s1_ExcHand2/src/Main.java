import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
		System.out.println("Enter the number of overs");
		int n= Integer.parseInt(br.readLine());
		
		
		int[] overs= new int[n];
		System.out.println("Enter the number of runs for each over");
		for(int i=0;i<n;i++)
		{
			overs[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter the over number");
		int m= Integer.parseInt(br.readLine());
		
		System.out.println(overs[m-1]);
		}catch(Exception e)
		{
			System.out.println(e.getClass().getName());
		}
		

	}

}
