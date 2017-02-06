
public class Venue {
	String name,city;

	public Venue()
	{
		
	}
	public String getName() {
		return name;
	}

	public Venue(String name, String city) {
		
		this.name = name;
		this.city = city;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return getClass()+"[ "+name + " --- " + city+" ]";
	}
	

}
