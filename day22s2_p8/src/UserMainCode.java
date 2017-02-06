
public class UserMainCode {
	
	public static boolean  validatePlayer(String s,String l) {
		
		char[] s1=s.toCharArray();
		char[] s2=l.toCharArray();
		if(s1.length==s2.length)
		{
		for(int i=0;i<s1.length;i++)
		{
			if((s1[i]+1)==s2[i])
			{
				
			}
			else{
				return false;
			
			}
		}
		}
		else
			return false;
		
		
		return true;
		
	}

}
