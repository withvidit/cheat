import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the player name");
		String name=br.readLine();
		System.out.println("Enter the team name");
		String team = br.readLine();
		UserMainCode.displaye(name, team);

	}

}
