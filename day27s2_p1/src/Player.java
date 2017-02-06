
public class Player  implements Comparable<Player>{
	int capNumber;
	String name,skill,country;
	int matchesPlayed;
	public Player(int capNumber, String name, String skill, String country,
			int matchesPlayed) {
		super();
		this.capNumber = capNumber;
		this.name = name;
		this.skill = skill;
		this.country = country;
		this.matchesPlayed = matchesPlayed;
	}
	public int getCapNumber() {
		return capNumber;
	}
	public void setCapNumber(int capNumber) {
		this.capNumber = capNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	@Override
	public String toString() {
		return this.getCapNumber() + "," + this.getName() + ","
				+ this.getSkill() + "," + this.getCountry() + ","
				+ this.getMatchesPlayed() ;
	}
	public int compareTo(Player player) {
		if(this.getCapNumber()==player.getCapNumber())
			return 0;
		else if(this.getCapNumber()>player.getCapNumber())
			return 1;
		else
			return -1;
	}
	
	
}
