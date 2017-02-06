
public class UserMainCode {
	
	public static void display(String x,String y) {
		
		String[]x1=x.split(" ");
		String []y1=y.split(" ");
		
		if(x1[x1.length-1].equals(y1[y1.length-1]))
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
