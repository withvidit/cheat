
public class Venue {
String stadiumName,city;

public String getStadiumName() {
	return stadiumName;
}

public void setStadiumName(String name) {
	this.stadiumName = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
public void Venuedetails()
{
	System.out.println("Venue Details\nVenue Name : "+this.getStadiumName()+"\nCity Name : "+this.getCity());
}
}
