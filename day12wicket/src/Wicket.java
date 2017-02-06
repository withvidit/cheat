
public class Wicket {
private long over,ball;
private String wicketType,playerName,bowlerName;


public void setOver(long over)
{
	this.over=over;
}
public void setBall(long ball)
{
	this.ball=ball;
}
public void setWicketType(String s)
{
	this.wicketType=s;
}
public void setPlayerName(String s)
{
	this.playerName=s;
}
public void setBowlerName(String s)
{
	this.bowlerName=s;
}

public long getOver()
{
	return this.over;
}
public long getBall()
{
	return this.ball;
}
public String getWicketType()
{
	return this.wicketType;
}
public String getPlayerName()
{
	return this.playerName;
}
public String getBowlerName()
{
	return this.bowlerName;
}
}
