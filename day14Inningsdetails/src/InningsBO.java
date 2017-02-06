
public class InningsBO {
	void displayAllInningsDetails(Innings[] inningsList)
	{
		System.out.println("Innings Details");
		for(int i=0;i<inningsList.length;i++)
		{
			System.out.println(inningsList[i].toString());		
		}
	}
}
