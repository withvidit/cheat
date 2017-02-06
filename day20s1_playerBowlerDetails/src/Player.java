
public class Player {
	protected String name,teamName;
	protected long noOfMatches;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public long getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(long noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public Player(String name, String teamName, long noOfMatches) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public void displayDetails()
	{
System.out.println("Bowler : "+this.getName()+"\nTeam : "+this.getTeamName()+"\nNumber of matches : "+this.getNoOfMatches());
	}
}
