import java.util.GregorianCalendar;


public class UserMainCode {
	public static void displayYear(int s) {
		
		GregorianCalendar cal = new GregorianCalendar();

		if(cal.isLeapYear(s))
		{
		    System.out.print(s+" is leap year");
		}
		else
		{ 
		    System.out.print(s+" is not leap year");
		}
		
	}

}
