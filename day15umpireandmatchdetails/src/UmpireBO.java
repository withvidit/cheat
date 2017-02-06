import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class UmpireBO
{

 public Umpire createUmpire (String data, UmpireType[] umpireTypeList)
 {
    String[] s= data.split(",");
    UmpireType ut=null;
    for(int i=0;i<umpireTypeList.length;i++)
    {
    	if(umpireTypeList[i].getType().equals(s[1]))
    	{
    		ut=umpireTypeList[i];
    	}
    }
    
    Umpire up= new Umpire(s[0], ut);
    return up;
    
 }

}
