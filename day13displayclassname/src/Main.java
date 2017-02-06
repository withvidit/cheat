import java.util.*;



public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the venue name");
		String s= sc.nextLine();
		System.out.println("Enter the city name");
		String t=sc.nextLine();
		System.out.println("Venue Details");
		Venue v= new Venue(s,t);
		System.out.println(v);
		sc.close();
		
	}

}
