
public class Delivery {
	
	public  void displayDeliveryDetails(String bowler,String batsman)
	{
		String[] bats= batsman.split(" ");
		String[] bow= bowler.split(" ");
		
		System.out.println("Bowler : "+bow[bow.length-1]+"\nBatsman : "+bats[bats.length-1]);
	}
	
	public void displayDeliveryDetails(long runs) {
		
		System.out.println("Number of runs scored in the delivery : "+runs);

		if (runs==4) {
			System.out.println("It is a Boundary.");
		}
		else if (runs==6) {
			System.out.println("It is a Sixer.");
		} 
		
	}

}
