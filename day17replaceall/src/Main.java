import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter team details");
		s=sc.nextLine();
		System.out.println("After replacement");
		System.out.println(s.replaceAll("Captain", "Skipper"));
	}
}
