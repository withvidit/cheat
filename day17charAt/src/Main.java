import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter team1");
		String team1=br.readLine();
		char[] t1= team1.toCharArray();
		System.out.println("Enter team2");
		String team2= br.readLine();
		char[] t2= team2.toCharArray();
		System.out.println("Enter third character");
		char x= (char)br.read();
		
		if(x==team1.charAt(2))
		{
			System.out.println("Winner Team : "+team1);
		}
		
		else if(x==team2.charAt(2))
		{
			System.out.println("Winner Team : "+team2);
		}
		
		
		
		
		
		
		
		
		//System.out.println(x);
		/*int flag=0,flag1=0;
		for(int i=0;i<team1.length();i++)
		{
			char y=team1.charAt(i);
			if(y == x)
			{
				flag=1;
			}
		}	
			if(flag==1)
			{
				System.out.println("Winner Team : "+team1);
			}
		
		for(int i=0;i<team2.length();i++)
		{
			//int flag=0;
			if(team2.charAt(i)== x)
			{
				flag1=1;
			}
			
			
		}
		if(flag1==1)
		{
			System.out.println("Winner Team : "+team2);
		}*/
	}

}
