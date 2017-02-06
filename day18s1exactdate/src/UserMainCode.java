import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class UserMainCode {
	public static void displayDateTime(String s) throws Exception {
		
		SimpleDateFormat sd= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dt= sd.parse(s);
		
		SimpleDateFormat sd1= new SimpleDateFormat("dd/MM/yyyy, H:mm:ss");
		
		String q= sd1.format(dt);
		System.out.println(q);
		
		
	}

}
