
public class Player {
	
	String name;
	String skill;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public String getSkill() {
		return skill;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Player(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		
		result = prime * result + ((skill == null) ? 0 : skill.hashCode());
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		/*if (skill == null) {
			if (other.skill != null)
				return false;
		} else if (!skill.equals(other.skill))
			return false;*/
		return true;
	}
	

}
