
public class Player {
protected String name,country;

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

public Player(String name, String country) {
	super();
	this.name = name;
	this.country = country;
}

public Player() {
	// TODO Auto-generated constructor stub
}

public void displayDetails()
{
	System.out.println("Player Details:\nPlayer name : "+this.getName()+"\nCountry : "+this.getCountry());
}
}
