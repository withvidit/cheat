
public class UserMainCode {
	
	public static boolean validateTeam(String s1) {
		String[] s={"RCB", "MI", "CSK", "SRH", "KXIP", "DD", "KKR", "RPSG" , "GL"};
		String[] spl=s1.split(" ");
		int count=0;
		for(int i=0;i<s.length;i++)
			if(spl[0].equals(s[i]))
				count++;
		
		
		if(count==0)
			return false;
		try{
		int x=Integer.parseInt(spl[1]);
		
		return true;
		}catch(Exception e)
		{
			return false;
		}
	}

}
