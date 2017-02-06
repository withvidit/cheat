import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String a,b,c;
		a=sc.nextLine();
		b=sc.nextLine();
		c=sc.nextLine();
		if(UserMainCode.validatePlayer(a, b, c)){
			System.out.println("Valid");
		}
		else{
			System.out.println("Invalid");
		}
	}
}
