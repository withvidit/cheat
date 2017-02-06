

public class Outcome {
 String winnerTeam;
long score;
String playerOfMatch;
public String getWinnerTeam() {
	return winnerTeam;
}
public void setWinnerTeam(String winnerTeam) {
	this.winnerTeam = winnerTeam;
}
public long getScore() {
	return score;
}
public void setScore(long score) {
	this.score = score;
}
public String getPlayerOfMatch() {
	return playerOfMatch;
}
public void setPlayerOfMatch(String playerOfMatch) {
	this.playerOfMatch = playerOfMatch;
}
public Outcome(String winnerTeam, long score, String playerOfMatch) {
	
	this.winnerTeam = winnerTeam;
	this.score = score;
	this.playerOfMatch = playerOfMatch;
}


public String equals(Outcome p)
{
	//boolean result;
	if((this.winnerTeam.equals(p.getWinnerTeam())) && (this.score == p.getScore()) && (this.playerOfMatch.equals(p.getPlayerOfMatch())))
			{
	//	result=true;
		return "Both the outcome details are same.";
		
			}
	else
		return "Both the outcome details are different.";
		//result= false;
	//return result;
}
public String toString() {
	return winnerTeam + " --- " + score+" --- "+playerOfMatch;
}
public Outcome()
{
	
}

}
