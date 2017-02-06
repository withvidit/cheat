import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Main {

	public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please provide the number of players to be registered");
		int n= Integer.parseInt(br.readLine());
		ArrayList<Player> player= new ArrayList<Player>();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Please enter player name");
			String name=br.readLine();
			System.out.println("Please select the skill of the player\n1.All Rounder\n2.Batsman\n3.Bowler");
			int s=Integer.parseInt(br.readLine());
			String skill="";
			switch(s)
			{
			case 1:skill="All Rounder";
			break;
			case 2:skill="Batsman";
			break;
			case 3:skill="Bowler";
			break;
			}
			player.add(new Player(name, skill));
		}
		
		PlayerComparator pc = new PlayerComparator();
		System.out.println("Player Details");
		Collections.sort(player,pc);
		
		Iterator<Player> it;
		it= player.iterator();
		 for(int i=0;i<player.size();i++){
				
			 System.out.println(it.next());
	}

	}

}
