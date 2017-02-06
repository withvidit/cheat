import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {
	public static void displayDate(String s) throws Exception {
		
		
		SimpleDateFormat sd= new SimpleDateFormat("yyyy-MM-dd");
		Date dt= sd.parse(s);
		Calendar cal= new GregorianCalendar();
		cal.setTime(dt);
		
		cal.add(Calendar.MONTH, -20);
		Date daten=cal.getTime();
		
		System.out.println("20 months before "+s+" will be "+sd.format(daten));
		
	}

}
