
public class PlayerBO {

	
	public void displayAllPlayerDetails(Player[] playerList) {
		System.out.println("Player Details");
		for(int i=0;i<playerList.length;i++)
		{
			System.out.println(playerList[i].toString());		
		}
	
	}
	public PlayerBO()
	{
		
	}
	
}
