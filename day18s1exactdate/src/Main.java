import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
public static void main(String[] args)throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter String in this format(YYYY-MM-DD HH:mm:ss)");
	String s= br.readLine();
	UserMainCode.displayDateTime(s);
	
}
}
