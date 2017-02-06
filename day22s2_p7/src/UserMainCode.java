
public class UserMainCode {
	
	public static boolean validateTeam(String s) {
		int even=0,odd=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' ||s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' )
			{
				if(i%2==0)
					even++;
				else
					odd++;
			}
		}
		if(even>odd)
			return false;
		else
			return true;
	}

}
