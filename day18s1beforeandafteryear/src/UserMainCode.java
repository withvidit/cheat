import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {
	public static void displayDateDetails(String s) throws Exception {
		SimpleDateFormat sd= new SimpleDateFormat("yyyy-MM-dd");
		Date dt= sd.parse(s);
		
		
		Calendar cal = new GregorianCalendar();
		cal.setTime(dt);
		cal.add(Calendar.YEAR, 1); 
		Date nextYear = cal.getTime();
		
		
		
		
		Calendar cal1 =new GregorianCalendar();
		cal1.setTime(dt);
		cal1.add(Calendar.YEAR, -1);
		Date prevYear=cal1.getTime();
		
		
		SimpleDateFormat sd1= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sd1.format(nextYear));
		System.out.println(sd1.format(prevYear));
		
		
	}

}
