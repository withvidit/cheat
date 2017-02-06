import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {
	
	public static void displayDay(String s) throws Exception {
		
		SimpleDateFormat sd= new SimpleDateFormat("yyyy-MM-dd");
		Date dt= sd.parse(s);
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
	        System.out.println(simpleDateFormat.format(dt));
		
	}

}


/*Calendar cal = new GregorianCalendar();
cal.setTime(new Date()); // Give your own date
System.out.println(cal.get(Calendar.DAY_OF_YEAR));*/
