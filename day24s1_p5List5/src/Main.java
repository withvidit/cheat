import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList <String> s= new ArrayList<String>();
		ArrayList <String> t= new ArrayList<String>();
		ArrayList <String> con= new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 8");
		for(int i=0;i<5;i++)
			s.add(br.readLine());
		
		System.out.println("Enter the top 5 scorers of IPL Season 9");
		for(int i=0;i<5;i++)
			t.add(br.readLine());
		
		for(int i=0;i<s.size();i++)
		{
			for(int j=0;j<t.size();j++)
			{
				if(s.get(i).equals(t.get(j)))
				{
					con.add(s.get(i));
				}
			}
		}
		System.out.println("Consistent run scorers");
		for(int i=0;i<con.size();i++)
			System.out.println(con.get(i));
	}

}
