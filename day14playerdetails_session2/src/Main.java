import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players");
		int n= Integer.parseInt(br.readLine());
		Player[] playerList= new Player[n];
		String name,country,skill;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the player name");
			name=br.readLine();
			System.out.println("Enter the country name");
			country=br.readLine();
			System.out.println("Enter the skill");
			skill=br.readLine();
			playerList[i]= new Player(name, country, skill);
			
		}
PlayerBO bo= new PlayerBO();
bo.displayAllPlayerDetails(playerList);

System.out.println("Enter the country name for which players details to be known");
String search=br.readLine();

bo.displaySpecificPlayerDetails(playerList, search);
	}

}
