import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String,Player> hm= new HashMap<String, Player>();
		
		do{
			int n=0;
			System.out.println("Enter the player name");
			String name=br.readLine();
			System.out.println("Enter wickets - seperated by \"|\" symbol.");
			String s=br.readLine();
			String[] st=s.split("\\|");
			
			n=st.length;
			
			
			//System.out.println(n);
			
			hm.put(name,new Player(name, n));
			System.out.println("Do you want to add another player (yes/no)");
		}while(br.readLine().equals("yes"));
		
		do
		{
			System.out.println("Enter the player name to search");
			String name1=br.readLine();
			int count=0;
			for ( Map.Entry<String, Player> entry : hm.entrySet()) {
			    String key = entry.getKey();
			    if(key.equals(name1))
			    {
			    	count=1;
			    Player player2 = entry.getValue();
			    
			    System.out.println("Player name : "+player2.getBowlerName()+"\nWicket Count : "+player2.getWicketCount());
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
