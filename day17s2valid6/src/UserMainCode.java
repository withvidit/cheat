
public class UserMainCode {
public static void  OrangeCapDetails(String s) {
	
	String s1=(s.subSequence(0,3)).toString();
	int x=0,flag=0;
	for(int i=3;i<s.length();i++)
	{
		if(flag==0)
		{
		if(s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9'||s.charAt(i)=='0')
		{
			x=i;
			flag=1;
		}
		}
	}
	//System.out.println(x);
	
	String s2=(s.subSequence(3,x).toString());
	int s3=Integer.parseInt(s.subSequence(x, s.length()).toString());
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
}
}
