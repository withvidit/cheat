
public class UserMainCode {
	
	public static boolean validateTeam(String s) {
		
		String[] split1=s.split("@");
		if(split1.length!=2)
		{
			return false;
		}
		
		String[] splitteamname=split1[0].split(" ");
		
		for(int i=0;i<splitteamname.length;i++)
		{
			for(char j='a';j<='z';j++)
			{
				if(splitteamname[i].charAt(0)==j)
					return false;
			}
		}
		
		String[] splitctandcap= split1[1].split("\\*");
		
		if(splitctandcap.length!=2)
		{
			//System.out.println("checking length 3");
			return false;
		}
		
		for(char j='a';j<='z';j++)
		{
			//System.out.println("checking city name");
			if(splitctandcap[0].charAt(0)==j)
				return false;
		}
		
		String[] splitcap= splitctandcap[1].split(" ");
		
		
		for(int i=0;i<splitcap.length;i++)
		{
			for(char j='a';j<='z';j++)
			{
				//System.out.println("checking captain name");
				if(splitcap[i].charAt(0)==j)
					return false;
			}
		}
		
		if(splitcap[1].charAt(splitcap.length-1)!='*')
		{
			return false;
		}
		
		
		//System.out.println("its out");
		return true;
		
	}

}
