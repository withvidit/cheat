import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InputStream i=new FileInputStream(new File("matchsummary.txt"));
		BufferedReader fr= new BufferedReader(new InputStreamReader(i));
		int start= Integer.parseInt(br.readLine());
		int end= Integer.parseInt(br.readLine());
		
		String line=fr.readLine();
		String skippedline=line.substring(start, end);
		
		System.out.println(skippedline);

	}

}
