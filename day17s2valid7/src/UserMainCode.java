
public class UserMainCode {
	public static boolean validatePlayer(String s) {
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' && (i+1)%2==0)
				return false;
		}
		return true;
	}

}
