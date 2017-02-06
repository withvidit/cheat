import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {
	
	public static void displayDay(String d1,String d2) throws Exception {
		int count=-1;
		SimpleDateFormat sd= new SimpleDateFormat("yyyy-MM-dd");
		Date dt= sd.parse(d1);
		Calendar cal1= new GregorianCalendar();
		cal1.setTime(dt);
		int count1=0;
		
		Date dt1= sd.parse(d2);
		Calendar cal2= new GregorianCalendar();
		cal2.setTime(dt1);
		
		while(cal1.getTime().before(cal2.getTime()))
		{
			cal1.add(Calendar.DAY_OF_YEAR, 1);
			if(cal1.get(Calendar.DAY_OF_WEEK)==1)
			{
				count1++;
			}
			
		}
		System.out.println(count1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		
	/*	int st=cal.get(Calendar.DAY_OF_WEEK);
		
		while(st!=1)
		{
			cal.add(Calendar.DAY_OF_WEEK, 1);
			st++;
		}
		
		
		int st1=cal1.get(Calendar.DAY_OF_WEEK);
		
		while(st1!=1)
		{
			cal.add(Calendar.DAY_OF_WEEK, 1);
			st1++;
		}
		
		
		
		while(cal.get(Calendar.WEEK_OF_YEAR)!=cal1.get(Calendar.WEEK_OF_YEAR))
		{
			cal.add(Calendar.WEEK_OF_YEAR, 1);
			count++;
		}
		System.out.println("asgjvaghavcjba");
		System.out.println(count);*/
		
		
		
		
	}

}
