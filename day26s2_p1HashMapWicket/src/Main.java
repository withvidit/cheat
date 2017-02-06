import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Bowler,Wicket> hm= new HashMap<Bowler, Wicket>(); 
		do{
		System.out.println("Enter the player name");
		Bowler  s= new Bowler(br.readLine());
		System.out.println("Enter wickets - seperated by \"|\" symbol");
		String n=(br.readLine());
		
		hm.put(s, new Wicket(n, s));
		
		
		System.out.println("Do you want to add another player (yes/no)");
		}while(br.readLine().equals("yes"));
		
		do
		{
			System.out.println("Enter the player name to search");
			String name1=br.readLine();
			int count=0;
			for ( Map.Entry<Bowler, Wicket> entry : hm.entrySet()) {
			    Bowler key = entry.getKey();
			    if(key.getName().equals(name1))
			    {
			    	count=1;
			    Wicket player2 = entry.getValue();
			    String[] wickets= player2.getPlayerName().split("\\|");
			    System.out.println("Player Name : "+key.getName()+"\nWickets :");//+"\nWickets Count : "+player2.getWicketCount());
			    for(int i=0;i<wickets.length;i++)
			    {
			    	System.out.println(wickets[i]);
			    }
			    
			    }// do something with key and/or tab
			}
			if(count==0)
			{
				System.out.println("No player found with the name "+name1);
			}
			System.out.println("Do you want to search another player (yes/no)");
		}while(br.readLine().equals("yes"));
		
		
		
	}

}
