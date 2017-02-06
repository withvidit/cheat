
public class Player implements Comparable<Player> {
	
	String playerName,skill;
	long capNumber;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public long getCapNumber() {
		return capNumber;
	}
	public void setCapNumber(long capNumber) {
		this.capNumber = capNumber;
	}
	public Player(String playerName, String skill, long capNumber) {
		super();
		this.playerName = playerName;
		this.skill = skill;
		this.capNumber = capNumber;
	}
	public int compareTo(Player p) {
		if(this.getCapNumber()==p.getCapNumber())  
			return 0;  
			else if(this.getCapNumber()>p.getCapNumber())  
			return 1;  
			else  
			return -1;
	}
	@Override
	public String toString() {
		return playerName + "-" + capNumber;
				
	}
	
	
	
	

}
