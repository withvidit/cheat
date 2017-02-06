import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {
	public static void displayTime(String s) throws Exception {
		
		SimpleDateFormat sd= new SimpleDateFormat("HH:mm:ss");
		Date dt= sd.parse(s);
		Calendar cal = new GregorianCalendar();
		
		cal.setTime(dt);
		//if()
		//System.out.println(cal.get(Calendar.HOUR_OF_DAY));
	
		cal.add(Calendar.HOUR_OF_DAY, 2);
		Date d1= cal.getTime();
		System.out.println(sd.format(d1));
		
	}
}
