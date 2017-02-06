import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the team name");
		String t=br.readLine();
		System.out.println("Enter the coach name");
		String c=br.readLine();
		System.out.println("Enter the location name");
		String l=br.readLine();
		System.out.println("Enter the players name");
		String p=br.readLine();
		System.out.println("Enter the captain name");
		String cap=br.readLine();
		
		Team team= new Team();
		team.setName(t);
		team.setCoach(c);
		team.setLocation(l);
		team.setPlayers(p);
		team.setCaptain(cap);
		
		team.displayTeamDetails();
	}

}
