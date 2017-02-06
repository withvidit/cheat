
public class MatchBO {
	
	public void displayAllMatchDetails(Match[] matchList)
	{
		System.out.println("Match Details");
		String[] y={"Team 1","Team 2","Date" , "Venue"};
		String a=String.format("%-35s %-30s %-15s %s",y);
		System.out.println(a);
		for(int i=0;i<matchList.length;i++)
			{
			System.out.println(matchList[i].toString());
		}
	}
	
	
public void displaySpecificMatchDetails(Match[] matchList, String date)
{

	System.out.println("Match Details");
	String[] y={"Team 1","Team 2","Date" , "Venue"};
	String a=String.format("%-35s %-30s %-15s %s",y);
	System.out.println(a);
	for(int i=0;i<matchList.length;i++)
		{
		if(matchList[i].getDate().equals(date))
		System.out.println(matchList[i].toString());
	}
	
}

}
