import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		ArrayList <Integer> a= new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
			a.add(sc.nextInt());
		
		a.sort(null);
		//System.out.println(a);
	
		for(int i=0;i<n;i++)
			System.out.println(a.get(i));

	}

}
