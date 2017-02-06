import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Main {
	
	public static void main(String args[]) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		float run,over;
		NumberFormat sf=new DecimalFormat("#0.00");
		double rr;
		try{
		System.out.println("Enter the total runs scored");
		run=Integer.parseInt(br.readLine());
		System.out.println("Enter the total overs faced");
		over=Integer.parseInt(br.readLine());
		if(over==0)
			throw new ArithmeticException();
		
		rr=run/over;
		System.out.println("Current Run Rate : "+sf.format(rr));
		}
	catch(Exception e)
	{
		System.out.println(e.getClass().getName());
	}  
}}
