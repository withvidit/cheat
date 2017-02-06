import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("input.txt"));
			
			FileUtility fu= new FileUtility();
			
			List<Player> lp=fu.readFileData(br);
			
			fu.writeDataToFile(lp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
