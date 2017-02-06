
public class UserMainCode {
public static boolean validateDate(String string) {
	{int flag=0;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='-')
				flag++;
		}
		if(flag!=2)
		{
			return false;
		}
		else
		{
			String[] news= string.split("-");
			int day=Integer.parseInt(news[0]);
			int month= Integer.parseInt(news[1]);
			//int year= Integer.parseInt(news[2]);
			
			if(day<=31 && month<13 )
				return true;
			else
				return false;
		}
		
	}
	
}
}
