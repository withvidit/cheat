import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader("input.txt"));
			
			FileUtility fu= new FileUtility();
			
			List<Player> lp=fu.readData(br);
			
			Iterator<Player> it=lp.iterator();
			
			for(int i=0;i<lp.size();i++)
			{ int k=1;
				System.out.println("Player " +(i+1));
				System.out.println(lp.get(i).toString());
				k++;
			}
			
			//fu.writeDataToFile(lp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

	}
	}

}
