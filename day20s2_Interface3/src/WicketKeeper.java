
public class WicketKeeper extends CricketPlayer implements IPlayerStatistics   {
private int noOfCatches, noOfStumpings ,noOfDismissals ;
private long runs;
public int getNoOfCatches() {
	return noOfCatches;
}
public void setNoOfCatches(int noOfCatches) {
	this.noOfCatches = noOfCatches;
}
public int getNoOfStumpings() {
	return noOfStumpings;
}
public void setNoOfStumpings(int noOfStumpings) {
	this.noOfStumpings = noOfStumpings;
}
public int getNoOfDismissals() {
	return noOfDismissals;
}
public void setNoOfDismissals(int noOfDismissals) {
	this.noOfDismissals = noOfDismissals;
}
public long getRuns() {
	return runs;
}
public void setRuns(long runs) {
	this.runs = runs;
}
public WicketKeeper(String name, String teamName, int noOfMatches,
		int noOfCatches, int noOfStumpings, long runs, int noOfDismissals) {
	super(name, teamName, noOfMatches);
	this.noOfCatches = noOfCatches;
	this.noOfStumpings = noOfStumpings;
	this.runs = runs;
	this.noOfDismissals = noOfDismissals;
	
}
public void displayPlayerStatistics() {
	System.out.println("Player name : "+this.getName()+"\nTeam name : "+this.getTeamName()+"\nNo of matches : "+this.getNoOfMatches()+"\nNo of catches taken : "+this.getNoOfCatches()+"\nNo of stumpings : "+this.getNoOfStumpings()+"\nNo of dismissals : "+this.getNoOfDismissals()+"\nRuns scored : "+this.getRuns());
	
}


}
