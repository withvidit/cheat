import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Histogram h=new Histogram();
		for(int i=0;i<n;i++){
			h.addScore(sc.nextInt());
		}
		h.displayHistogram();
	}
}
