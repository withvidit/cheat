
public class Wicket {
private long over,ball;
private String wicketType,playerName,bowlerName;
public long getOver() {
	return over;
}
public void setOver(long over) {
	this.over = over;
}
public long getBall() {
	return ball;
}
public void setBall(long ball) {
	this.ball = ball;
}
public String getWicketType() {
	return wicketType;
}
public void setWicketType(String wicketType) {
	this.wicketType = wicketType;
}
public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
public String getBowlerName() {
	return bowlerName;
}
public void setBowlerName(String bowlerName) {
	this.bowlerName = bowlerName;
}
public Wicket(long over, long ball, String wicketType, String playerName,
		String bowlerName) {
	
	this.over = over;
	this.ball = ball;
	this.wicketType = wicketType;
	this.playerName = playerName;
	this.bowlerName = bowlerName;
}
public String toString() {
	String s="Over:"+getOver()+"\nBall:"+getBall()+"\nWicket Type:"+getWicketType()+"\nPlayer Name:"+getPlayerName()+"\nBowler Name:"+getBowlerName();
	return s;
}
public Wicket() {
	
}






}
