
public class Bowler extends Player {
private long noOfWickets;

public long getNoOfWickets() {
	return noOfWickets;
}

public void setNoOfWickets(long noOfWickets) {
	this.noOfWickets = noOfWickets;
}

public Bowler(String name, String teamName, long noOfMatches, long noOfWickets) {
	super(name, teamName, noOfMatches);
	this.noOfWickets = noOfWickets;
}

public Bowler() {
	// TODO Auto-generated constructor stub
}

public void  displayDetails()
{
	super.displayDetails();
	System.out.println("Number of wickets taken : "+this.getNoOfWickets());
}

}
