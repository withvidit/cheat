
public class Revenue  implements Comparable<Revenue> {
	
	 String revenueCategory;
	int amount;
	public Revenue(String revenueCategory, int amount) {
		super();
		this.revenueCategory = revenueCategory;
		this.amount = amount;
	}
	public Revenue()
	{
		
	}
	public String getRevenueCategory() {
		return revenueCategory;
	}
	public void setRevenueCategory(String revenueCategory) {
		this.revenueCategory = revenueCategory;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	 
	
	public int compareTo(Revenue rev) {
		
		if(getAmount()==rev.getAmount())  
			return 0;  
			else if(this.getAmount()>rev.getAmount())  
			return 1;  
			else  
			return -1;  
		
	}
	@Override
	public String toString() {
		 String x= String.format("%-15s%-15s",this.getRevenueCategory(), this.getAmount());
		 return x;
	}
	
	
	

}
