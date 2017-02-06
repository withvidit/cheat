import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter the total prize amount");
	float n= Float.parseFloat(br.readLine());
	
	System.out.println("Enter the number of players");
	float num=Float.parseFloat(br.readLine());
	if(num==0)
		throw new ArithmeticException();
	float x=n/num;
	System.out.printf("Total prize amount :%.2f",x);
	
		}catch(NumberFormatException e)
		{
			System.out.println(e.getClass().getName());
		}
		
		catch(ArithmeticException a)
		{
			System.out.println(a.getClass().getName());
		}
	}

}
