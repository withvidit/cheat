
public class Player {
	
	String bowlerName;
	int wicketCount;
	public Player(String bowlerName, int wicketCount) {
		super();
		this.bowlerName = bowlerName;
		this.wicketCount = wicketCount;
	}
	public String getBowlerName() {
		return bowlerName;
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}
	public int getWicketCount() {
		return wicketCount;
	}
	public void setWicketCount(int wicketCount) {
		this.wicketCount = wicketCount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bowlerName == null) ? 0 : bowlerName.hashCode());
		result = prime * result + wicketCount;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (bowlerName == null) {
			if (other.bowlerName != null)
				return false;
		} else if (!bowlerName.equals(other.bowlerName))
			return false;
		if (wicketCount != other.wicketCount)
			return false;
		return true;
	}
	

}
