import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Menu\n1.Player details of the delivery\n2.Run details of the delivery");
		int n=Integer.parseInt(br.readLine());
		Delivery del= new Delivery();
		switch(n)
		{
		case 1:
			System.out.println("Enter the bowler name");
			String bow=br.readLine();
			System.out.println("Enter the batsman name");
			String bat= br.readLine();
			
			del.displayDeliveryDetails(bow, bat);
			break;
		case 2:
			System.out.println("Enter the number of runs");
			long runs=Long.parseLong(br.readLine());
			del.displayDeliveryDetails(runs);
		}
		
	}

}
