
public class UserMainCode {
	public static void display(String f,String l) {
		f=f.toLowerCase();
		char[] f1= f.toCharArray();
		
		f1[0]=Character.toUpperCase(f.charAt(0));
		
		String x=String.valueOf(f1);
		
		
		
		
		l=l.toUpperCase();
		
		System.out.println(x+ " "+l);
		//System.out.println(l);
		
	}
}
























/*
f=f.toLowerCase();
//System.out.println(f);
char a=Character.toUpperCase(f.charAt(0));
System.out.println(f);
f = f.replace(f.charAt(0),a);
System.out.println(f);
char z= Character.toLowerCase(f.charAt(f.length()-1));
f=f.replace(f.charAt(f.length()-1),z);
System.out.println(f);
l=l.toUpperCase();
*/