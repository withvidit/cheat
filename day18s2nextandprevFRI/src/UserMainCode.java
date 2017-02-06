import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {
	public static void	DisplayDate(int year,int month,int date)throws Exception {
		
		String s= year+"-"+month+"-"+date;
		
		SimpleDateFormat sd= new SimpleDateFormat("yyyy-MM-dd");
		Date dt= sd.parse(s);
		Calendar cal = new GregorianCalendar();
		
		cal.setTime(dt);
		int st= cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(st);
		
		while(st!=6)
		{
			cal.add(Calendar.DAY_OF_WEEK, 1);
			st++;
		}
		
		Date dt1=cal.getTime();
		
		System.out.println("Next Friday: "+sd.format(dt1));
		
		
		Calendar cal1 = new GregorianCalendar();
		
		cal.add(Calendar.DAY_OF_WEEK_IN_MONTH, -1);
		Date dt2=cal.getTime();
		
		System.out.println("Previous Friday: "+sd.format(dt2));
		
		
	}
}
