
public class UserMainCode {
	
	public static void display(String s) {
		String[] s1=s.split(" ");
		String[] s2 = s1;
		
		
		for(int i=0;i<s1.length;i++)
			System.out.println(s1[i]);
		for(int i=s1.length-1;i>=0;i--)
		System.out.print(s1[i]+" ");
		
	}

}
