
public class CricketPlayer extends Player implements IPlayerStatistics {
	private long totalRunsScored;
	private int noOfWicketsTaken;
	/*public CricketPlayer(long totalRunsScored, int noOfWicketsTaken) {
		super(name, teamName, noOfWicketsTaken);
		this.totalRunsScored = totalRunsScored;
		this.noOfWicketsTaken = noOfWicketsTaken;
	}*/
	
	
	
	 public void displayPlayerStatistics()
	 {
		 System.out.println("Player Details\nPlayer name : "+this.getName()+"\nTeam name : "+this.getTeamName()+"\nNo of matches : "+this.getNoOfMatches()+"\nTotal runsscored : "+this.getTotalRunsScored()+"\nNo of wickets taken : "+this.getNoOfWicketsTaken());
	 }


	public CricketPlayer(String name, String teamName, int noOfMatches,
			long totalRunsScored, int noOfWicketsTaken) {
		super(name, teamName, noOfMatches);
		this.totalRunsScored = totalRunsScored;
		this.noOfWicketsTaken = noOfWicketsTaken;
	}


	public long getTotalRunsScored() {
		return totalRunsScored;
	}


	public void setTotalRunsScored(long totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}


	public int getNoOfWicketsTaken() {
		return noOfWicketsTaken;
	}


	public void setNoOfWicketsTaken(int noOfWicketsTaken) {
		this.noOfWicketsTaken = noOfWicketsTaken;
	}
	 
	 

	

}
