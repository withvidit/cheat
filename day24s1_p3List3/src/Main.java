

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n= Integer.parseInt(br.readLine());
		
		ArrayList <String> s= new ArrayList<String>();
		
		for(int i=0;i<n;i++)
			s.add(br.readLine());
		
		String x=br.readLine();
		int count=Collections.frequency(s, x);
		System.out.println(count);
	}

}
