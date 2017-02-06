import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class PlayerBO
{

  public Player createPlayer(String data)
   {
     String[] s1= data.split(",");
     Player player= new Player(s1[0], s1[1], s1[2]);
     return player;
     
   }

}
