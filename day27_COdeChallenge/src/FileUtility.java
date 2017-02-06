import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileUtility {
	
	public List<Player> readData(BufferedReader br)
	{
		List<Player> lp= new ArrayList<Player>();
		 String str;
		    try {
				while ((str = br.readLine()) != null)
				{
					String[] str1=str.split(",");
					lp.add(new Player(str1[0],str1[1],str1[2]));
				}

				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lp;
		//return null;
		
	}

}
