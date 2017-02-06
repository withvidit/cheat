import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the team name");
		String x= br.readLine();
		
	ArrayList<Integer>a = new ArrayList<Integer>() ;
	
	System.out.println("Enter the number of matches played in home ground");
	int home= Integer.parseInt(br.readLine());
	System.out.println("Enter the runs scored");
	for(int i=0;i<home;i++)
		a.add(Integer.parseInt(br.readLine()));
	
	System.out.println("Enter the number of matches played in other ground");
	int home1= Integer.parseInt(br.readLine());
	System.out.println("Enter the runs scored");
	for(int i=0;i<home1;i++)
		a.add(Integer.parseInt(br.readLine()));
	
	System.out.println("Runs scored by "+x);
	for(int i=0;i<a.size();i++)
		System.out.println(a.get(i));
	
	System.out.println("Run scored by "+x+" more than 300");
	for(int i=0;i<a.size();i++)
		if(a.get(i)>300)
		System.out.println(a.get(i));
	
	

	}

}
