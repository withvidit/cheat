import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of players");
		n=sc.nextInt();
		sc.nextLine();
		String p[]=new String[n];
		for(int i=0;i<n;i++){
			p[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++){
			if(p[i].indexOf('a')==p[i].lastIndexOf('a')){
				System.out.println("Player of the Match:");
				System.out.println(p[i]);
			}
		}
	}
}
