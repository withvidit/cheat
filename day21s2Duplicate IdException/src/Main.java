import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {

            
       try
       {
    	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	   System.out.println("Enter the team name");
    	   String tname=br.readLine();
    	   System.out.println("Enter the number of players suggested");
    	   int n= Integer.parseInt(br.readLine());
    	   int[] Id= new int[n];
    	   String[] name= new String[n];
    	   for(int i=0;i<n;i++)
    	   {
    		   System.out.println("Enter player "+(i+1)+" details");
    		   Id[i]=Integer.parseInt(br.readLine());
    		   for(int j=0;j<i;j++)
    		   {
    			   if(Id[i]==Id[j])
    				   throw new DuplicateIdException("Player Id must be unique");
    		   }
    		   name[i]=br.readLine();
    	   }
    	   for(int i=0;i<n;i++)
    	   System.out.println(Id[i]+" "+name[i]);
       }
       catch(Exception e)
       {
    	   System.out.println(e);
       }
    }
}

