import java.util.Comparator;


public class PlayerComparator implements Comparator<Player> {
	public int compare(Player player1, Player player2)
	{
		int p1=0,p2=0;
		if(player1.getSkill().equals("All Rounder"))
			p1=1;
		else if(player1.getSkill().equals("Batsman"))
			p1=2;
		if(player1.getSkill().equals("Bowler"))
			p1=3;
		
		if(player2.getSkill().equals("All Rounder"))
			p2=1;
		else if(player2.getSkill().equals("Batsman"))
			p2=2;
		else if(player2.getSkill().equals("Bowler"))
			p2=3;
		
		if(p1==p2)
		return -1;
		else if(p1>p2)
			return 1;
		else 
			return -1;
		
	}

}
