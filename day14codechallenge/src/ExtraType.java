
public class ExtraType {
	private long eventNO,points;
	private String eType,ScoringTeam;
	public long getEventNO() {
		return eventNO;
	}
	public void setEventNO(long eventNO) {
		this.eventNO = eventNO;
	}
	public long getPoints() {
		return points;
	}
	public void setPoints(long points) {
		this.points = points;
	}
	public String geteType() {
		return eType;
	}
	public void seteType(String eType) {
		this.eType = eType;
	}
	public String getScoringTeam() {
		return ScoringTeam;
	}
	public void setScoringTeam(String scoringTeam) {
		ScoringTeam = scoringTeam;
	}
	public ExtraType(long eventNO, String eType, long points, String scoringTeam) {
		this.eventNO = eventNO;
		this.points = points;
		this.eType = eType;
		ScoringTeam = scoringTeam;
	}
	public ExtraType() {
		
	}
	public String toString() {
		return "EventNo : "+getEventNO()+"\nExtra Type : "+geteType()+"\nPoints Scored : "+getPoints()+"\nScoring Team : "+getScoringTeam();
	}
	

}
