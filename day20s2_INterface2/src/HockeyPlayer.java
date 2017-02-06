
public class HockeyPlayer extends Player implements IPlayerStatistics {
	
	private String Position;
	private int noOfGoals;
	/*public HockeyPlayer(String position, int noOfGoals) {
		super();
		Position = position;
		this.noOfGoals = noOfGoals;
	}*/
	
	
	
		public void displayPlayerStatistics()
		 {
			 System.out.println("Player Details\nPlayer name : "+this.getName()+"\nTeam name : "+this.getTeamName()+"\nNo of matches : "+this.getNoOfMatches()+"\nPosition : "+this.getPosition()+"\nNo of goals taken : "+this.getNoOfGoals());
		 }


		public HockeyPlayer(String name, String teamName, int noOfMatches,
			String position, int noOfGoals) {
		super(name, teamName, noOfMatches);
		Position = position;
		this.noOfGoals = noOfGoals;
	}


		public String getPosition() {
			return Position;
		}


		public void setPosition(String position) {
			Position = position;
		}


		public int getNoOfGoals() {
			return noOfGoals;
		}


		public void setNoOfGoals(int noOfGoals) {
			this.noOfGoals = noOfGoals;
		}
		
	

}
