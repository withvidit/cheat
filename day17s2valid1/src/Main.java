import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		//UserMainCode umc= new UserMainCode();
		if(UserMainCode.validateDate(s))
		{
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");

	}

}
