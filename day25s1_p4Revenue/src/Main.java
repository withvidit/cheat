import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int sum=0;
		TreeSet<Revenue> set= new TreeSet<Revenue>();  
		do
		{
		System.out.println("Enter revenue category");
		String cat=br.readLine();
		
		System.out.println("Enter revenue amount");
		int amount= Integer.parseInt(br.readLine());
		
		set.add(new Revenue(cat, amount));
		sum+=amount;
		System.out.println("Do you want to continue(yes/no):");
		}while(br.readLine().equals("yes"));
		
		
		Iterator<Revenue> iterator;
		iterator = set.descendingIterator();
		System.out.println("Top spending categories");
		System.out.println(String.format("%-15s%-15s","Category", "Amount"));
		
		 while (iterator.hasNext()){
			
			 System.out.println(iterator.next());
	}
System.out.println("Total amount earned: "+sum);

	
	
	}
	


}
