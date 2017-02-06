import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input string");
		String s= br.readLine();
		
		LetterSequence ls= new LetterSequence(s);
		
		ls.displayLetterFrequency(ls.computeFrequency());

	}

}
