import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
	
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Menu\n1.Match Date\n2.Match Venue\n3.Match Outcome");
		int n= Integer.parseInt(br.readLine());
		Match match= new Match();  
		
		switch (n) {
		case 1:
			System.out.println("Enter the date of the match");
			String s= br.readLine();
			SimpleDateFormat dt= new SimpleDateFormat("dd/MM/yyyy");
			Date d= dt.parse(s);
			match.displayMatchDetails(d);
			break;
			
		case 2:
			System.out.println("Enter venue of the match");
			String venue= br.readLine();
			match.displayMatchDetails(venue);
			break;
			
		case 3:
			System.out.println("Enter the winner team of the match");
			String wt=br.readLine();
			System.out.println("Enter the number of runs");
			long runs= Long.parseLong(br.readLine());
			match.displayMatchDetails(wt, runs);
			break;

		default:
			break;
		}
		
	}

}
