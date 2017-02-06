import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class MatchBO
{
   
 public Match createMatch(String data, Team[] teamList)
  {
 
    String[] s= data.split(",");
    Team t= null;
    for(int i=0;i<teamList.length;i++)
    {
    	if(teamList[i].getName().equals(s[1]))
    	{
    		t= teamList[i];
    	}
    }
    Match match = new Match(s[0],s[1],s[2],s[3], t);
    return match;
    
    
  }

  public Match findTeam(String matchDate, Match[] matchList)
  {
	  Match m= null;
    for(int i=0;i<matchList.length;i++)
    {
    	if(matchList[i].getDate().equals(matchDate))
    		m=matchList[i];
    }
   return m;
  }

  public void findAllMatchesInGivenTeam(String teamName, Match[] matchList)
  {
   String[] sw= {"Date","TeamOne","TeamTwo","Venue"};
   System.out.println(String.format("%-15s %-15s %-15s %s",sw));
   
   for(int i=0;i<matchList.length;i++)
   {
	   if(matchList[i].getTeam().getName().equals(teamName))
	   {
		   System.out.println(matchList[i].toString());
	   }
   }
  
   }


  
}
