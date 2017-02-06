import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Venue v= new Venue();
		String[] arr= new String[2];
		System.out.println("Enter the venue details");
		String s=br.readLine();
		arr=s.split(",");
		
		v.name=arr[0];
		v.city=arr[1];
		System.out.println("Venue Details\nVenue Name : "+v.name+"\nCity Name : "+v.city);
		

	}

}
