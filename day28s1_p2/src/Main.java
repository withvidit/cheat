import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;



public class Main {
	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Thread[] t= new Thread[3];
		CalculateScores[] c= new CalculateScores[3];
		
		for (int i = 0; i < t.length; i++) {
			System.out.println("Enter the match :");
			String match=br.readLine();
			System.out.println("Enter the scores :");
			String scores=br.readLine();
			c[i]= new  CalculateScores(match, scores);
			t[i]= new Thread(c[i]);
			t[i].start();
		}
		
		for (int i = 0; i < t.length; i++) {
			t[i].join();
		}
		
		
		DecimalFormat df=new DecimalFormat("#.00");
		System.out.println("Score Summary");
		for(int i=0;i<3;i++){
			System.out.println("Match : "+c[i].getMatchType());
			System.out.println("Mean : "+df.format(c[i].getMeanScore()));
			System.out.println("Min Score : "+c[i].getMinScore());
			System.out.println("Max Score : "+c[i].getMaxScore());
		}
		
	}
	
	
}
