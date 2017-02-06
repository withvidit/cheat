
public class InternationalPlayer extends Player {
	
	private String capNumber;
	private long noOfTestAppearance,noOfODIAppearance;
	public String getCapNumber() {
		return capNumber;
	}
	public void setCapNumber(String capNumber) {
		this.capNumber = capNumber;
	}
	public long getNoOfTestAppearance() {
		return noOfTestAppearance;
	}
	public void setNoOfTestAppearance(long noOfTestAppearance) {
		this.noOfTestAppearance = noOfTestAppearance;
	}
	public long getNoOfODIAppearance() {
		return noOfODIAppearance;
	}
	public void setNoOfODIAppearance(long noOfODIAppearance) {
		this.noOfODIAppearance = noOfODIAppearance;
	}
	public InternationalPlayer(String name, String country, String capNumber,
			long noOfTestAppearance, long noOfODIAppearance) {
		super(name, country);
		this.capNumber = capNumber;
		this.noOfTestAppearance = noOfTestAppearance;
		this.noOfODIAppearance = noOfODIAppearance;
	}
	
	public InternationalPlayer() {
		// TODO Auto-generated constructor stub
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Cap number : "+this.getCapNumber()+"\nNumber of test appearnace : "+this.getNoOfTestAppearance()+"\nNumber of ODI appearnace : "+this.getNoOfODIAppearance());
	}
	
	

}
