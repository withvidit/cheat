import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList set= new ArrayList();
		System.out.println("Enter the number of bowlers");
		int n= Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
			set.add(br.readLine());
		
		TreeSet set1= new TreeSet();
		set1.addAll(set);
		
		Iterator iterator;
		iterator = set1.iterator();
		System.out.println("Players list in ascending order");
		while (iterator.hasNext()){
			   System.out.println(iterator.next());



			}
		

	}

}
