
public class DeliveryBO {
	
	public void displayAllDeliveryDetails(Delivery[] deliveryList)
	{
		System.out.println("Delivery Details");
		String[] x1= {"Over","Ball","Runs","Batsman","Bowler","NonStriker"};
		String s1= String.format("%-20s %-20s %-20s %-20s %-20s %s",x1);
		System.out.println(s1);
		for(int i=0;i<deliveryList.length;i++)
		{
			System.out.println(deliveryList[i].toString());
		}
	}
	
	
	public void displayBatsmanBowlerDetails(Delivery[] deliveryList, long ball,long over)
	{
		for(int i=0;i<deliveryList.length;i++)
		{
			if(deliveryList[i].getBall()==ball && deliveryList[i].getOver()==over)
			{
				System.out.println("Batsman : "+deliveryList[i].getBatsman());
				System.out.println("Bowler : "+deliveryList[i].getBowler());
			}
		}
	}
	
	public void displayMaximumRunDetails(Delivery[] deliveryList)
	{
		long max=0,ball=0,over=0;
		for(int i=0;i<deliveryList.length;i++)
		{
			
			if(deliveryList[i].getRuns()>max)
			{
				max=deliveryList[i].getRuns();
				ball=deliveryList[i].getBall();
				over= deliveryList[i].getOver();
			}
		}
		System.out.println("Maximum Runs : "+max);
		System.out.println("Over : "+over);
		System.out.println("Ball : "+ball);
	}
public DeliveryBO()
{
	
}
}
