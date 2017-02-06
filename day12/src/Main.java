import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
public static void main(String[] args)throws Exception {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//String l1,l2,l3;
	Player player= new Player();
	System.out.println("Enter the player name");
	player.name=br.readLine();
	System.out.println("Enter the country name");
	player.country=br.readLine();
	System.out.println("Enter the skill");
	player.skill=br.readLine();
	
	
	
	
	System.out.println("Player Details : \nPlayer Name : "+player.name+"\nCountry Name : "+player.country+"\nSkill : "+player.skill);
	
}

}
