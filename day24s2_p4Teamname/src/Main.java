import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader(new InputStreamReader(System .in));
String s=br.readLine();
ArrayList<Character> c= new ArrayList<Character>();
for(int i=0;i<s.length();i++)
	c.add(s.charAt(i));
	
	Collections.reverse(c);
	
	for(int i=0;i<c.size();i++)
		System.out.println(c.get(i));
	}

}
