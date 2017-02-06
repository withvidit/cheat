import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList a= new ArrayList();
		System.out.println("Enter the player details");
		System.out.println("Enter player name");
		String s= br.readLine();
		a.add(s);
		System.out.println("Enter age");
		a.add((br.readLine()));
		System.out.println("Enter Country");
		a.add(br.readLine());
		
		System.out.println("Player Details");
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		
		System.out.println("Enter Skill");
		String q= br.readLine();
		System.out.println("Enter the position to add the skill");
		int n= Integer.parseInt(br.readLine());
		
		a.set(n,q);
		
		System.out.println("Player Details");
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		
		System.out.println("Enter the position of the detail to be removed");
		int e=Integer.parseInt(br.readLine());
		
		a.remove(e);
		
		System.out.println("Player Details");
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		
		

	}

}
