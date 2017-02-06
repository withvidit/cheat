import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		
		int year= sc.nextInt();
		int month= sc.nextInt();
		UserMainCode.displayDay(year, month);

	}

}
