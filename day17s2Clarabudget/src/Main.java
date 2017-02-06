import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String [] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		int count=0;
		if(x.length()<=50)
		{
			for(int i=0;i<x.length()-2;i++)
			{
				String s=""+x.charAt(i)+""+x.charAt(i+1)+x.charAt(i+2);
				//System.out.println(s.toString());
				int y=Integer.parseInt(s);
				if(y%4==0)
					count++;
				
			}
		}
			System.out.println(count);
		
	}

}
