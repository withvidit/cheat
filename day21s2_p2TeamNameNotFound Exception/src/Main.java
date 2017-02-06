import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	
	public static void main(String [] args) {
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] name={"Chennai Super Kings","Deccan Chargers","Delhi Daredevils","Kings XI Punjab","Kolkata Knight Riders","Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};
			int flag=0;
			System.out.println("Enter the expected winner team of IPL Season 4");
			String winner= br.readLine();
			for(int i=0;i<name.length;i++)
			{
				if(winner.equals(name[i]))
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 4");
			}
			System.out.println("Enter the expected runner Team of IPL Season 4");
			String runner= br.readLine();
			flag=0;
			for(int i=0;i<name.length;i++)
			{
				if(runner.equals(name[i]))
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 4");
			}
			
			
			System.out.println("Expected IPL Season 4 winner: "+winner+"\nExpected IPL Season 4 runner: "+runner);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
