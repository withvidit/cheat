
public class Player {
	String name,country,skill;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}


	public void Playerdetails()
	{
		System.out.println("Player Details\nPlayer Name :"+this.name+"\nCountry Name :"+this.country+"\nSkill :"+this.skill);
	}

}
