import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		SortScore s[]=new SortScore[3];
		for(int i=0;i<3;i++){
			System.out.println("Enter the Match :");
			String name=sc.nextLine();
			System.out.println("Enter the Scores :");
			String score=sc.nextLine();
			s[i]=new SortScore(name, score);
		}
		s[0].start();
		try{
			s[0].join();
		}
		catch(Exception e){}
		s[1].start();
		try{
			s[1].join();
		}
		catch(Exception e){}
		s[2].start();
		try{
			s[2].join();
		}
		catch(Exception e){}
		System.out.println("Ordered Score List");
		for(int i=0;i<3;i++){
			int a[]=s[i].getScores();
			System.out.println("Match : "+s[i].getMatchType());
			for(int j=0;j<a.length;j++){
				System.out.println(a[j]);
			}
		}
	}
}
