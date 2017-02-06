import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the team details");
		 String s=br.readLine();
		 String[] arr= s.split("#");
		
		Team team= new Team();
		team.setName(arr[0]);
		team.setCoach(arr[1]);
		team.setLocation(arr[2]);
		team.setPlayers(arr[3]);
		team.setCaptain(arr[4]);
		
		team.displayTeamDetails();
	}

}
