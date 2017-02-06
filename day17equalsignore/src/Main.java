import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter team1");
		String v1=br.readLine();
		System.out.println("Enter team2");
		String v2= br.readLine();
		
		if(v1.equalsIgnoreCase(v2))
		{
			System.out.println("Both the venues are same.");
		}
		else
		{
			System.out.println("Both the venues are different.");
		}
		
	}

}
