import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class UserMainCode {
	public static void displayDate(String s) throws Exception {
		
		SimpleDateFormat sd= new SimpleDateFormat("MMM dd, yyyy");
		Date dt= sd.parse(s);
		
		SimpleDateFormat sd1= new SimpleDateFormat("yyyy-MM-dd");
		
		String q= sd1.format(dt);
		System.out.println(q);
		
		
	}

}
