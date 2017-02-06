import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class TeamBO
{

  
 public Team createTeam(String data, Player[] playerList)
 {
	 String[] s1= data.split(",");
	 Player p=null;
    for(int i=0;i<playerList.length;i++)
    {
    if(playerList[i].getName().equals(s1[1]))
    {
    	 p= playerList[i];
    }
    
       }
    Team team = new Team(s1[0], p);
    return team;

 }
 


}
