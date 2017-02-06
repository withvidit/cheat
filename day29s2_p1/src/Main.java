import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter range of numbers");
		int start=Integer.parseInt(br.readLine());
		int end=Integer.parseInt(br.readLine());
		Scores[] scores= new Scores[2];
		Thread[] threads= new Thread[2];
		
		scores[0]= new Scores(start, end, "Odd");
		threads[0]= new Thread(scores[0]);
		scores[1]= new Scores(start, end, "Even");
		threads[1]= new Thread(scores[1]);
		threads[0].start();
		threads[1].start();
		try{
		
		threads[0].join();
		threads[1].join();
		
		
		}
		catch(Exception e)
		{
			
		}
		for (int i = 0; i < threads.length; i++) {
			
			if(scores[i].getScoreType().equals("Odd"))
			{
				System.out.println("Odd numbers in given range");
				scores[i].display();
			}
			
			
			else if(scores[i].getScoreType().equals("Even"))
			{
				System.out.println("Even numbers in given range");
			scores[i].display();
		}
		}

	}

}
