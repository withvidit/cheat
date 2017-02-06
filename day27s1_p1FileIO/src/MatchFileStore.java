import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MatchFileStore {
	public List<Match> obtainMatchFromFile(InputStream i) throws Exception {
		List<Match> m=new ArrayList<Match>();
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(i));
			String line;
			while((line=br.readLine())!=null){
				String pine=line.trim();
				//String pine=tine.replaceAll(" ","");
				m.add(new Match(pine.substring(0,5).trim(), pine.substring(5, 10).trim(), pine.substring(10, 30).trim(), pine.substring(30, 40).trim()));
			}
		}
		catch(Exception e){
			
		}
		return m;
	}
	
}
