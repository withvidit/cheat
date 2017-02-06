import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the over");
	long o=s.nextLong();
	System.out.println("Enter the ball");
	long b=s.nextLong();
	System.out.println("Enter the runs");
	long r=s.nextLong();
	System.out.println("Enter the batsman name");
	s.nextLine();
	String bat_name=s.nextLine();
	System.out.println("Enter the bowler name");
	String bow_name=s.nextLine();
	System.out.println("Enter the nonStriker name");
	String non_name=s.nextLine();
	Delivery del=new Delivery();
	del.over=o;
	del.ball=b;
	del.runs=r;
	del.batsman=bat_name;
	del.bowler=bow_name;
	del.nonStriker=non_name;
	del.displayDeliveryDetails();
	
}
} 