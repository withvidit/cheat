import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> s= new ArrayList<String>();
		
		for(int i=0;i<5;i++)
			s.add(br.readLine());
		
		System.out.println("Enter swap positons");
		int n=Integer.parseInt(br.readLine());
		int x=Integer.parseInt(br.readLine());
		
		Collections.swap(s, n, x);
		
		for(int i=0;i<5;i++)
			System.out.println(s.get(i));

	}

}
