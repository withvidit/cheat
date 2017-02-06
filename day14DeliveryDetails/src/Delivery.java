  public class Delivery {
    private
    long over;
	long ball;
	String batsman;
	String  bowler;
	String  nonStriker;
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
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}
	public Delivery(long over2, long ball2, String batsman, String bowler,
			String nonStriker) {

		this.over = over2;
		this.ball = ball2;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}
	public String toString()
	{
		return String.format("Over :"+getOver()+"\nBall :"+getBall()+"\nBatsman :"+getBatsman()+"\nBowler :"+getBowler()+"\nNonStriker :"+getNonStriker(),null);
		
	}

}


