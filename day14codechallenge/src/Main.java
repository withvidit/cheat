import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of events");
		int n = Integer.parseInt(br.readLine());
		ExtraType[] extraTypleList = new ExtraType[n];
		String et,team;
		long eno,points;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the event number");
			eno= Long.parseLong(br.readLine());
			System.out.println("Enter the extra type");
			et= br.readLine();
			System.out.println("Enter the points scored");
			points= Long.parseLong(br.readLine());
			System.out.println("Enter the scoring team");
			team= br.readLine();
			
			extraTypleList[i]= new ExtraType(eno, et, points, team);
		}
		
		ExtraTypeBO bo= new ExtraTypeBO();
		bo.displayExtraTypeDetails(extraTypleList);
	}

}
