import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players");
		int n= Integer.parseInt(br.readLine());
		System.out.println("Enter the player name");
		String[] arr= new String[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=br.readLine();
		}
		System.out.println("Player name starting with 'M' or Ending with 'a'");
		for(int i=0;i<n;i++)
		{
			if(arr[i].startsWith("M") || arr[i].endsWith("a"))
			{
				System.out.println(arr[i]);
			}
		}
		

	}

}
