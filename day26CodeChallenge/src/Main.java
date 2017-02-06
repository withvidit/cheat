import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
	
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String,Player> hm= new HashMap<String, Player>();
		System.out.println("Enter the number of players");
		int n= Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of the player "+(i+1));
			String jersyNumber=br.readLine();
			String name=br.readLine();
			String team=br.readLine();
			String skill=br.readLine();
			
			hm.put(jersyNumber, new Player(name, team, skill));
		}
		
		System.out.println("Enter the jersy number to be searched");
		String x=br.readLine();
		int count=0;
		for ( Map.Entry<String, Player> entry : hm.entrySet()) {
		    String key = entry.getKey();
		    
		    if(key.equals(x))
		    {System.out.println("Player Details");
		    count=1;
		    	Player p= entry.getValue();
		    	System.out.println(p.toString());
		    }
		}
		if(count==0)
		{
			System.out.println("Player not found");
		}
		
	}

}
