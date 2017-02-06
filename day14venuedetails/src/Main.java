import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
    	Scanner scanner= new Scanner(System.in);
    	String name;
    	String city;
    	System.out.println("Enter the venue name");
    	name=scanner.next();
    	System.out.println("Enter the city name");
    	city=scanner.next();
		//fill your code
		Venue venue= new Venue(name, city);
		VenueBO venueBO= new VenueBO();
		venueBO.displayVenueDetails(venue);
		scanner.close();
	}

}


