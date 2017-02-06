import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter player name ");
		String name=br.readLine();
		System.out.println("Enter player country");
		String country=br.readLine();
		System.out.println("Enter the Cap number");
		String cap= (br.readLine());
		System.out.println("Enter the number of test appearnace");
		long test=Long.parseLong(br.readLine());
		System.out.println("Enter the number of ODI appearnace");
		long odi= Long.parseLong(br.readLine());
		
		InternationalPlayer ip= new InternationalPlayer(name, country, cap, test, odi);
		ip.displayDetails();
		
	}

}
