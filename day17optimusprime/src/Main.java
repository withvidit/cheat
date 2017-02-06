import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int n,x=0,y=0;
		String s;
		n=sc.nextInt();
		sc.nextLine();
		s=sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='U'){
				y=y+1;
			}
			else if(ch[i]=='D'){
				y=y-1;
			}
			else if(ch[i]=='R'){
				x=x+1;
			}
			else if(ch[i]=='L'){
				x=x-1;
			}
		}
		System.out.println(x+" "+y);
	}
}
