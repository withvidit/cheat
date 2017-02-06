
public class Match {
	private String date,teamOne,teamTwo,venue;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Match(String date, String teamOne, String teamTwo, String venue) {
	
		this.date = date;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.venue = venue;
	}

	public Match() {
		
	}

	public String toString() {
		
		String[] x={getTeamOne(),getTeamTwo(),getDate(),getVenue()};
		String s=String.format("%-35s %-30s %-15s %s",x);
		return s;
	}
	

}
