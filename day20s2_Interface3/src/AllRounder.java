
public class AllRounder extends CricketPlayer implements IPlayerStatistics  {
	private long  runs;
	private int noOfWickets;
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public int getNoOfWickets() {
		return noOfWickets;
	}
	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	public AllRounder(String name, String teamName, int noOfMatches, long runs,
			int noOfWickets) {
		super(name, teamName, noOfMatches);
		this.runs = runs;
		this.noOfWickets = noOfWickets;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player name : "+this.getName()+"\nTeam name : "+this.getTeamName()+"\nNo of matches : "+this.getNoOfMatches()+"\nRuns scored : "+this.getRuns()+"\nNo of wickets taken : "+this.getNoOfWickets());
		
	}
	

}
