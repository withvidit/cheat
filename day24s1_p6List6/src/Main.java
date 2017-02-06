import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the teams in ranking table");
		ArrayList<String> s= new ArrayList<String>();
		
		for(int i=0;i<5;i++)
			s.add(br.readLine());
		
		System.out.println("Enter the rank to be searched");
		int n= Integer.parseInt(br.readLine());
		
		System.out.println(s.get(n-1));

	}

}
