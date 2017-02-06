import java.util.Scanner;


public class Main {
       public static void main(String[] args) throws Exception {
              Scanner s=new Scanner(System.in);
              String a=s.nextLine();
              int n=UserMainCode.vowelcount(a);
              if(n>0)
              {
                     System.out.println(n);
              }
       }
}
