import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String s;
		int n;
		System.out.println("Enter Player name");
		s=sc.nextLine();
		System.out.println("Enter starting index");
		n=sc.nextInt();
		System.out.println("Short name of "+s+": "+s.substring(n));
	}
}
