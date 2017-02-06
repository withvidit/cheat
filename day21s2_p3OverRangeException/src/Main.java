import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Main {

	public static void main(String[] args) {
		try
		{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			NumberFormat sf=new DecimalFormat("#0.00");
			System.out.println("Enter the total runs scored");
			float runs=Integer.parseInt(br.readLine());
			System.out.println("Enter the total overs faced");
			float overs=Integer.parseInt(br.readLine());
			
			if(overs<=0 || overs>20)
			{
				throw new OverRangeException("Over is not in the specified range");
			}
			
			float runrate=runs/overs;
			System.out.println("Current Run Rate :"+sf.format(runrate));
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
