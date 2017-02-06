
public class Batsman extends CricketPlayer implements IPlayerStatistics  {
	private long runs;

	public long getRuns() {
		return runs;
	}

	public void setRuns(long runs) {
		this.runs = runs;
	}

	public Batsman(String name, String teamName, int noOfMatches, long runs) {
		super(name, teamName, noOfMatches);
		this.runs = runs;
	}

	public void displayPlayerStatistics() {
		System.out.println("Player name : "+this.getName()+"\nTeam name : "+this.getTeamName()+"\nNo of matches : "+this.getNoOfMatches()+"\nRuns scored : "+this.getRuns());
		
	}
	

}
