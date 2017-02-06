import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Scores extends Thread {

	public Scores() {
		// TODO Auto-generated constructor stub
	}
	
	int start,end;
	String scoreType;
	List<Integer> scoreList=new ArrayList<Integer>();
	public Scores(int start, int end, String scoreType) {
		super();
		this.start = start;
		this.end = end;
		this.scoreType = scoreType;
	}
	

	public String getScoreType() {
		return scoreType;
	}


	public void setScoreType(String scoreType) {
		this.scoreType = scoreType;
	}


	public void run() {
		if(scoreType.equals("Odd"))
		{
			for (int i = start; i <= end; i++) {
				if(i%2==1)
				{
				//	System.out.println(i);
				scoreList.add(i);
				}
			}
		}
		if(scoreType.equals("Even"))
		{
			for (int i = start; i <= end; i++) {
				if(i%2==0)
				scoreList.add(i);
				
			}
		}
	}
	
	public void display()
	{
		Iterator i=scoreList.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
	}

}
