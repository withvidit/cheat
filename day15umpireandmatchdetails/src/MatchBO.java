import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class MatchBO
{
 
 public Match createMatch(String data, Umpire[] umpireList)
  {
	 String[] se= data.split(",");
	 Umpire ump=null;
   for(int i=0;i<umpireList.length;i++)
   {
	   if(umpireList[i].getName().equals(se[3]))
	   {
		  ump= umpireList[i];
	   }
   }
   
   Match m= new Match(se[0],se[1],se[2], ump);
   return m;
  }

  public Match findUmpire(String matchDate, Match[] matchList)
  {
	  Match m=null;
   for(int i=0;i<matchList.length;i++)
   {
	   if(matchList[i].getDate().equals(matchDate))
	   {
		   m= matchList[i];
	   }
   }
   return m;
  }
 
  public void findAllMatchesOfGivenUmpire(String umpireName, Match[] matchList)
  {
   for(int i=0;i<matchList.length;i++)
   {
	   if(matchList[i].getUmpire().getName().equals(umpireName))
	   {
		   System.out.println(matchList[i].toString());
	   }
   }
  }
}
