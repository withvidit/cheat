import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Histogram  {
	private HashMap<Integer,List<Integer>> bins=new HashMap<Integer,List<Integer>>();
	List<Integer> one=new ArrayList<Integer>();
	List<Integer> two=new ArrayList<Integer>();
	List<Integer> three=new ArrayList<Integer>();
	List<Integer> four=new ArrayList<Integer>();
	
	
	public HashMap<Integer, List<Integer>> getBins() {
		return bins;
	}
	public void setBins(HashMap<Integer, List<Integer>> bins) {
		this.bins = bins;
	}
	public void addScore(int n) {
		if(n<=10){
			one.add(n);
		}
		else if(n>10&&n<=20){
			two.add(n);
		}
		else if(n>20&&n<=30){
			three.add(n);
		}
		else if(n>30&&n<=40){
			four.add(n);
		}
	}
	public void displayHistogram() {
		bins.put(10, one);
		bins.put(20, two);
		bins.put(30, three);
		bins.put(40, four);
		
		int val1=0,val2=0,val3=0,val4=0;
	    System.out.println("Histogram");
	    for ( Map.Entry<Integer,List<Integer>> entry : bins.entrySet()) {
		    int key = entry.getKey();
		    List<Integer> l=entry.getValue();
		    /*System.out.print(key+" : ");
		    for(int i=0;i<l.size();i++){
		    	System.out.print("*");
		    }*/
		    
		    if(key==10)
		    	val1=l.size();
		    else if(key==20)
		    	val2=l.size();
		    else if(key==30)
		    	val3=l.size();
		    else if(key==40)
		    	val4=l.size();
		    //System.out.println();
		}
	    System.out.print("10 : ");
	    for(int i=0;i<val1;i++)
	    {
	    	System.out.print("*");
	    }
	    System.out.println();
	    System.out.print("20 : ");
	    for(int i=0;i<val2;i++)
	    {
	    	System.out.print("*");
	    } 
	    System.out.println();
	    System.out.print("30 : ");
	    for(int i=0;i<val3;i++)
	    {
	    	System.out.print("*");
	    } 
	    System.out.println();
	    System.out.print("40 : ");
	    for(int i=0;i<val4;i++)
	    {
	    	System.out.print("*");
	    }
	    System.out.println();
	}
	
}
