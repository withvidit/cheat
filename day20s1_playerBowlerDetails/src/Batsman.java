
public class Batsman extends Player {
	private long noOfRuns;

	public long getNoOfRuns() {
		return noOfRuns;
	}

	public void setNoOfRuns(long noOfRuns) {
		this.noOfRuns = noOfRuns;
	}

	public Batsman(String name, String teamName, long noOfMatches, long noOfRuns) {
		super(name, teamName, noOfMatches);
		this.noOfRuns = noOfRuns;
	}

	public Batsman() {
		// TODO Auto-generated constructor stub
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Number of runs scored : "+this.getNoOfRuns());
	}
	
	

}
