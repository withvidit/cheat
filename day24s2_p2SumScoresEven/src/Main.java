import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n= Integer.parseInt(br.readLine());
		ArrayList a= new ArrayList();
		for(int i=0;i<n;i++)
			a.add(br.readLine());
		int sum=0;
		for(int i=0;i<a.size();i++)
		{
			if(i%2==1)
				sum+=Integer.parseInt((String) a.get(i));
		}
		System.out.println(sum);

	}

}
