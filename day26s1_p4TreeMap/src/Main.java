import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of players");
		int n= Integer.parseInt(br.readLine());
		TreeMap<String,Player> tm= new TreeMap<String, Player>();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of the player "+(i+1));
			String cap=br.readLine();
			String name=br.readLine();
			String team=br.readLine();
			String skill=br.readLine();
			
			tm.put(cap, new Player(name, team, skill));
		}
		
		
		System.out.println("Player Details");
		for ( Map.Entry<String, Player> entry : tm.entrySet()) {
		    String key = entry.getKey();
		    
		    Player player2 = entry.getValue();
		    
		    System.out.println(key+player2.toString());
		    }// do something with key and/or tab
		}
	}


