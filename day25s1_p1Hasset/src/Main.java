import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		HashSet set= new HashSet();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++)
			set.add(br.readLine());
		
		System.out.println(set.size());

	}

}
