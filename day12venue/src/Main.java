import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Main {

	public static void main(String[] args) throws Exception {
		
		Venue v= new Venue();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the venue name");
		v.name=br.readLine();
		System.out.println("Enter the city name");
		v.city=br.readLine();
		
		System.out.println("Venue Details :\nVenue Name : "+v.name+"\nCity Name : "+v.city);


	}

}
