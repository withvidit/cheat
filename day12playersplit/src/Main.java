import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		String[] arr= new String[3];
		Player pl= new Player();
		System.out.println("Enter the player details");
		String s=sc.nextLine();
		arr=s.split(",");
		for(int i=0;i<3;i++)
		{
			//System.out.println(arr[i]);
		}
		pl.name=arr[0];
		pl.country= arr[1];
		pl.skill=arr[2];
		
		System.out.println("Player Details :\nPlayer Name : "+pl.name+"\nCountry Name : "+pl.country+"\nSkill : "+pl.skill);
		sc.close();
		
	}

}
