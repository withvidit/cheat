import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the extratype details");
		String s=sc.nextLine();
		String[] a=s.split("#");
		ExtraType et= new ExtraType();
		et.setName(a[0]);
		et.setRuns(Integer.parseInt(a[1]));
		
		System.out.println("ExtraType Details\nExtra Type:"+et.getName()+"\nRuns:"+et.getRuns());
		sc.close();

	}

}
