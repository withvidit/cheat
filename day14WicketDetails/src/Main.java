import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of wickets");
		int n= Integer.parseInt(br.readLine());
		Wicket[] wicket= new Wicket[n];
		String[] s1= new String[5];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of wicket "+(i+1));
			String s= br.readLine();
			 s1= s.split(",");
			wicket[i]= new Wicket(Long.parseLong(s1[0]),Long.parseLong(s1[1]), s1[2], s1[3], s1[4]);
			
		}
		WicketBO bo=new WicketBO();
		
		bo.displayAllWicketDetails(wicket);
		
		System.out.println("Enter the wicket type to be searched");
		String search=br.readLine();
		
		bo.displaySpecificWicketDetails(wicket, search);
		
		
	}
}
