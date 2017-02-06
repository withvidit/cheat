import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;


public class Main {

	public static void main(String[] args) throws Exception, Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the over");
		long o=Long.parseLong(br.readLine());
		System.out.println("Enter the ball");
		long b=Long.parseLong(br.readLine());
		System.out.println("Enter the wicket type");
		String type=br.readLine();
		System.out.println("Enter the player name");
		String bat=br.readLine();
		System.out.println("Enter the bowler name");
		String bow= br.readLine();
		Wicket w= new Wicket();
		
		w.setOver(o);
		w.setBall(b);
		w.setWicketType(type);
		w.setPlayerName(bat);
		w.setBowlerName(bow);
		
		System.out.println("Wicket Details\nOver : "+w.getOver()+"\nBall : "+w.getBall()+"\nWicket Type : "+w.getWicketType()+"\nPlayer Name : "+w.getPlayerName() +"\nBowler Name : "+w.getBowlerName());   
		

	}

}
