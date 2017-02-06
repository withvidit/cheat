import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n= Integer.parseInt(br.readLine());
		
		ArrayList a= new ArrayList();
		
		for(int i=0;i<n;i++)
			a.add(br.readLine());
		
		String x="";
		String q="";
		do{
			System.out.println("Menu\n1.Insert Players\n2.Delete Players");
			switch(Integer.parseInt(br.readLine()))
			{
				case 1:
					a.add(br.readLine());
					System.out.println("Player details after insertion");
					for(int i=0;i<a.size();i++)
						System.out.println(a.get(i));
					System.out.println("Do you want to continue");
					q=br.readLine();
					break;
					
				case 2:
					String s=br.readLine();
					a.remove(s);
					System.out.println("Player details after deletion");
					for(int i=0;i<a.size();i++)
						System.out.println(a.get(i));
					System.out.println("Do you want to continue");
					q=br.readLine();
					break;
					
			
			}
		}while(q.equalsIgnoreCase("Yes"));

	}

}
