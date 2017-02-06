import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {
	
	public static void displayDay(String s) throws Exception {
		

		
		SimpleDateFormat sd= new SimpleDateFormat("yyyy-MM-dd");
		Date dt= sd.parse(s);
		Calendar cal = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();
		
		cal2.setTime(dt);
		
		cal2.add(Calendar.DATE, -10);
		Calendar cal3=cal2;
		Date dt2= cal3.getTime();
		System.out.println(sd.format(dt2));
		
		SimpleDateFormat sd1= new SimpleDateFormat("EEEEEEEE");
		System.out.println(sd1.format(dt2));
		
		
		
		
		
		
		
		cal.setTime(dt);
		
		cal.add(Calendar.DATE, 10);
		Calendar cal1=cal;
		Date dt1= cal1.getTime();
		System.out.println(sd.format(dt1));
		
		//SimpleDateFormat sd1= new SimpleDateFormat("EEEEEEEE");
		System.out.println(sd1.format(dt1));
		
		
		
	}

}
