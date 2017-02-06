import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of lines in the summary");
		int n= Integer.parseInt(br.readLine());
		TitleCaseThread[] ttc= new TitleCaseThread[n];
		Thread[] t= new Thread[n];
		
		for (int i = 0; i < t.length; i++) {
			String x= br.readLine();
			
			ttc[i]= new TitleCaseThread(x);
			t[i]= new Thread(ttc[i]);
			t[i].start();
		}
		
		for (int j = 0; j < t.length; j++) {
			t[j].join();
		}
		
		for (int i = 0; i < t.length; i++) {
			System.out.println("Sentence "+(i+1)+" : "+ttc[i].getModifiedSummary());
		}
		
	}

}
