import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String args[])throws Exception {
		
	
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter team name");
	String s1=br.readLine();
	System.out.println("Enter starting index of the sequence");
	int st= Integer.parseInt(br.readLine());
	System.out.println("Enter ending index of the sequence");
	int end= Integer.parseInt(br.readLine());
	
	System.out.println(s1.subSequence(st, end));
	
	}
}
