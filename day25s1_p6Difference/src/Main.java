import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;


public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		HashSet set1= new HashSet();
		HashSet set2 = new HashSet();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of best bowlers in season 4");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the name of players");
		for(int i=0;i<n;i++)
			set1.add(br.readLine());
		
		System.out.println("Enter the number of best bowlers in season 5");
		int m=Integer.parseInt(br.readLine());
		System.out.println("Enter the name of players");
		for(int i=0;i<m;i++)
			set2.add(br.readLine());
		Iterator i=set1.iterator();
		System.out.println("Player Set 1");
		while (i.hasNext()){
			
			 System.out.println(i.next());
	}
		System.out.println("Player Set 2");
		i=set2.iterator();
		while (i.hasNext()){
			
			 System.out.println(i.next());
	}
		

		set1.removeAll(set2);
		System.out.println("Difference");
		i=set1.iterator();
		while (i.hasNext()){
			
			 System.out.println(i.next());
	}
	}

}
