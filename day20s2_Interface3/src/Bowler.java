
public class Bowler extends CricketPlayer implements IPlayerStatistics {
	
	private int noOfWickets;

	public int getNoOfWickets() {
		return noOfWickets;
	}

	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}

	public Bowler(String name, String teamName, int noOfMatches, int noOfWickets) {
		super(name, teamName, noOfMatches);
		this.noOfWickets = noOfWickets;
	}

	public void displayPlayerStatistics() {
		System.out.println("Player name : "+this.getName()+"\nTeam name : "+this.getTeamName()+"\nNo of matches : "+this.getNoOfMatches()+"\nNo of wickets taken : "+this.getNoOfWickets());
		
	}
	

}
