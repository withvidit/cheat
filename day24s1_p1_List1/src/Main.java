import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n= Integer.parseInt(br.readLine());
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
			a.add(Integer.parseInt(br.readLine()));
		
		
		
		int sum = 0;
		for(Integer d : a)
		    sum += d;
		System.out.println(sum);
		
		System.out.println((float)sum/n);
		
		

	}

}
