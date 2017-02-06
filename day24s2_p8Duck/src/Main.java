import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		ArrayList<String> a= new ArrayList<String>();
		String[] x;
		for(int i=0;i<n;i++)
			a.add(br.readLine());
		int count=0;
		for(int i=0;i<a.size();i++)
		{
			 x=a.get(i).split("-");
			
			if(x[1].equals("0") && x[2].equals("0"))
			{
				System.out.println(x[0]);
				count++;
			}
		}
		if(count==0)
			System.out.println("No player has scored a duck");
		

	}

}
