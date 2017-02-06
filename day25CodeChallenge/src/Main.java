import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n= Integer.parseInt(br.readLine());

TreeSet set= new TreeSet();
for(int i=0;i<n;i++)
	set.add(br.readLine());

Iterator iterator;
iterator = set.iterator();
while (iterator.hasNext()){
	   System.out.println(iterator.next());



	}
	}
}
