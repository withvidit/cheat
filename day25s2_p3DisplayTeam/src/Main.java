import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;


public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		Team []q = new Team[n];
		int count=0,count1=0;;
		for(int i=0;i<n;i++)
		{
			count=0;
			String s=br.readLine();
			String[] t= s.split("\\|");
			
			
			//System.out.println(t.toString());
			
			for(int j=0;j<count1;j++)
			{
				count=0;
				if(q[j]!=null)
				{
				if(q[j].getName().equals(t[0]))
			{
					q[j].addPlayer(t[1]);
					
			}
				else
					count++;
			}
			}
				
			if(count==i)
			{
				q[count1]=new Team(t[0]);
				q[count1].addPlayer(t[1]);
				count1++;
			}
			
			System.out.println(q[i]);
			
		}
		
		
		for(int i=0;i<q.length;i++)
		{
			
			//if(q[i]!=null)
			System.out.println(q[i].toString());
		}
		
		
		
		
		
		
		
	}

}
