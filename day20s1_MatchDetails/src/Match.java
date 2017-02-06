import java.text.SimpleDateFormat;
import java.util.Date;


public class Match {
public void displayMatchDetails(Date matchDate) {
	SimpleDateFormat dt= new SimpleDateFormat("MM-dd-yyyy");
	String s=dt.format(matchDate);
	System.out.println("Match Date : "+s);
	
}


public void displayMatchDetails(String venue)
{
	String[] s= venue.split(",");
	System.out.println("Match Venue :\nStadium : "+s[0]+"\nCity : "+s[1]);
}


public void displayMatchDetails(String winnerTeam,long runs)
{
	System.out.println("Match Outcome :\n"+winnerTeam+" won by "+runs+" runs");
}

}
