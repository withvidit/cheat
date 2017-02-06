
public class UserMainCode {
	public static boolean validateTeam(String s) {
		
		String[] s1= s.split("-");
		int flag=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='-')
			{
				flag++;
			}
		}
		if(flag==s.length())
			return false;
		else
		{
		String[] newname= s1[0].split(" ");
		int flag1=0;
		
		if(newname.length==s1[1].length())
		{
		for(int i=0;i<newname.length;i++)
		{
			
			if(newname[i].charAt(0)==s1[1].charAt(i))
			{
				flag1++;
			}
		}
		}
		else
		{
			return false;
		}
		
		if(flag1==newname.length)
		return true;
		else
			return false;
		}
	}

}
