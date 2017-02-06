import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the player");
		String n=sc.nextLine();
		System.out.println("Enter the team name");
		String t=sc.nextLine();
		System.out.println("Enter the number of matches played");
		String m=sc.nextLine();
		String w=n+","+t+","+m;
		FileOutputStream fos=null;
		File file;
		try{
			file= new File("player.csv");
			fos=new FileOutputStream(file);
			if(!file.exists()){
				file.createNewFile();
			}
			byte[] ba=w.getBytes();
			fos.write(ba);
			fos.flush();
		}
		catch(Exception e){
			
		}
	}
}
