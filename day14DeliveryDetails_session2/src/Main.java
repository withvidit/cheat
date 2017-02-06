import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of deliveries");
		int n= Integer.parseInt(br.readLine());
		Delivery[] deliveryList= new Delivery[n];
		long o,b,r;
		String bat,bow,non;
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the over");
			o= Long.parseLong(br.readLine());
			System.out.println("Enter the ball");
			b=Long.parseLong(br.readLine());
			System.out.println("Enter the runs");
			r=Long.parseLong(br.readLine());
			System.out.println("Enter the batsman name");
			bat=br.readLine();
			System.out.println("Enter the bowler name");
			bow=br.readLine();
			System.out.println("Enter the nonStriker name");
			non=br.readLine();
			
			deliveryList[i]= new Delivery(o, b, r, bat, bow, non);
			
		}
		
		DeliveryBO bo= new DeliveryBO();
		System.out.println("Enter your choice\n1.View delivery details\n2.Batsman and Bowler\n3.Maximum runs");
		int ka= Integer.parseInt(br.readLine());
		
		switch(ka)
		{
		case 1: bo.displayAllDeliveryDetails(deliveryList);
		break;
		case 2: 
			System.out.println("Enter the over for which batsman and bowler to be known");
			long over1=Long.parseLong(br.readLine());
			System.out.println("Enter the ball for which batsman and bowler to be known");
			long ball1=Long.parseLong(br.readLine());
			bo.displayBatsmanBowlerDetails(deliveryList, ball1, over1);
			break;
			
			case 3: bo.displayMaximumRunDetails(deliveryList);
			break;
		}

	}
	
	
	
	

}
