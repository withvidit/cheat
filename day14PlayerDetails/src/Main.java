import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the player name");
		String name=sc.nextLine();
		System.out.println("Enter the country name");
		String country=sc.nextLine();
		System.out.println("Enter the skill");
		String skill=sc.nextLine();
		
		Player player = new Player(name, country, skill);
		
		PlayerBO bo= new PlayerBO();
		bo.displayPlayerDetails(player);
		//System.out.println(player);
		sc.close();
		
		
	}

}
