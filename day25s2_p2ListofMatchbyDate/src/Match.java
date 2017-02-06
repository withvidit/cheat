import java.text.SimpleDateFormat;
import java.util.Date;


public class Match implements Comparable<Match> {
	
	Date matchDate;
	String teamOne;
	String teamTwo;
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
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
	public Match(Date matchDate, String teamOne, String teamTwo) {
		super();
		this.matchDate = matchDate;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	public int compareTo(Match mat) {
		if(this.getMatchDate().getTime()==mat.getMatchDate().getTime())  
			return 0;  
			else if(this.getMatchDate().getTime()>mat.getMatchDate().getTime())  
			return 1;  
			else  
			return -1;
	}
	@Override
	public String toString() {
		
		SimpleDateFormat sdf= new SimpleDateFormat("MM-dd-yyyy");
		String s=sdf.format(this.getMatchDate());
		
		String d=("Team 1 "+this.getTeamOne()+"\nTeam 2 "+this.getTeamTwo()+"\nMatch held on "+s);
		return d;
	}
	
	
	
	

}
