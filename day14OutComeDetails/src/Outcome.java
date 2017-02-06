
public class Outcome {
	private String date,status,winnerTeam,playerOfMatch;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWinnerTeam() {
		return winnerTeam;
	}

	public void setWinnerTeam(String winnerTeam) {
		this.winnerTeam = winnerTeam;
	}

	public String getPlayerOfMatch() {
		return playerOfMatch;
	}

	public void setPlayerOfMatch(String playerOfMatch) {
		this.playerOfMatch = playerOfMatch;
	}

	public Outcome(String date, String status, String winnerTeam,
			String playerOfMatch) {
		
		this.date = date;
		this.status = status;
		this.winnerTeam = winnerTeam;
		this.playerOfMatch = playerOfMatch;
	}

	public Outcome() {
		
	}

	public String toString() {
		
		String[] x={getStatus(),getWinnerTeam(),getPlayerOfMatch(),getDate()};
		String s= String.format("%-20s %-20s %-20s %s",x);
		return s;
	}
	

}
