import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class FileUtility {
	
	public List<Player> readFileData(BufferedReader br)
	{
		List<Player> lp= new ArrayList<Player>();
		
		 String str;
		    try {
				while ((str = br.readLine()) != null)
				{
					String[] str1=str.split(",");
					lp.add(new Player(Integer.parseInt(str1[0]), str1[1],str1[2], str1[3], Integer.parseInt(str1[4])));
				}

				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lp;
		
	}
	
	void writeDataToFile(List<Player> playerList)throws Exception
	{
		PrintWriter pw=new PrintWriter(new File("output6.csv"));
		for(Player li :playerList)
		{
			String j=li.getCapNumber()+","+li.getName()+","+li.getSkill()+","+li.getCountry()+","+li.getMatchesPlayed();
			pw.write(j);
			pw.write("\n");
					
		}
		pw.close();
		
	}
}
