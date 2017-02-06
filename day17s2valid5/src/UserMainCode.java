
public class UserMainCode {

	public static boolean validateOver(String s) {
		
		int flag=0;
		if(s.length()!=6)
			return false;
		else
		{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='N')
				return false;
			else if(s.charAt(i)=='W')
				flag++;
			/*else if(s.charAt(i)!='0' ||s.charAt(i)!='1' ||s.charAt(i)!='2' ||s.charAt(i)!='3' ||s.charAt(i)!='4' ||s.charAt(i)!='6' )
				return false;*/
			
				
		}
		}
		//System.out.println(flag);
		if(flag>=1)
			return true;
		else
			return false;
		
	}
}
