import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {
	public static void displayDate(int date,int day) throws Exception {
		
		SimpleDateFormat sd= new SimpleDateFormat("yyyy");
		String date1=Integer.toString(date);
		Date dt= sd.parse(date1);
		Calendar cal = new GregorianCalendar();
		cal.setTime(dt);
		day-=1;
		cal.add(Calendar.DAY_OF_YEAR, day);
		
		Date newd= cal.getTime();
		SimpleDateFormat sd1= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println((day+1)+"th day of "+date+" : "+sd1.format(newd));
		
		
		
	}
}
