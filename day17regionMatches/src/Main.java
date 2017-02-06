import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String a,b;
		System.out.println("Enter player names");
		a=sc.nextLine();
		b=sc.nextLine();
		if(a.regionMatches(0, b, 0, 7)){
			System.out.println("Both the players names starts with Michael");
		}
		else{
			System.out.println("Both the players names does not starts with Michael");
		}
	}
}
