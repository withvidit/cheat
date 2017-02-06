import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
		Class c=Class.forName("Player");  
		Player s=(Player)c.newInstance(); 
		
		}catch(Exception e)
		{
			System.out.println("Trying to invoke a no-argument constructor (that is not available) using newInstance method");
			System.out.println("Exception Occured : "+e.getClass().getName());
		}
		
		finally
		{
			System.out.println("Enter name of the player");
			String name=br.readLine();
			System.out.println("Enter country of the player");
			String country=br.readLine();
			System.out.println("Enter skillset of the player");
			String skill=br.readLine();
			Player player= new Player(name, country, skill);
			 
			System.out.println(player.getName()+", "+player.getCountry()+", "+player.getSkill());
		}
	}

}
