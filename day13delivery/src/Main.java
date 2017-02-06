import java.io.*;
import java.util.*;
public class Main {

       public static void main(String[] args) {
              
                  Scanner sc=new Scanner(System.in);
                     long o,b,r;
                     String ba,bo,non;
                     
                     System.out.println("Enter the over");
                     o=sc.nextLong();
                     System.out.println("Enter the ball");
                     b=sc.nextLong();
                     System.out.println("Enter the runs");
                     r=sc.nextLong();
                     sc.nextLine();
                     System.out.println("Enter the batsman name");
                     ba=sc.nextLine();
                     System.out.println("Enter the bowler name");
                     bo=sc.nextLine();
                     System.out.println("Enter the nonStriker name");
                     non=sc.nextLine();
                     Delivery de=new Delivery(o,b,r,ba,bo,non);
                     
                     de.displayDeliveryDetails();             
       }

}
