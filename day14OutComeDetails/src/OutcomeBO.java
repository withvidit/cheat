
public class OutcomeBO {
	
	
public void displayAllOutcomeDetails(Outcome[] outcomeList)
{
	System.out.println("Outcome Details");
	String[] x1={"Status","Winning Team","Player Of The Match","Date"};
	String s1= String.format("%-20s %-20s %-20s %s",x1);
	System.out.println(s1);
	for(int i=0;i<outcomeList.length;i++)
	{
		System.out.println(outcomeList[i].toString());
	}
}

public void displaySpecificOutcomeDetails(Outcome[] outcomeList, String date)
{
	System.out.println("Outcome Details");
	String[] x1={"Status","Winning Team","Player Of The Match","Date"};
	String s1= String.format("%-20s %-20s %-20s %s",x1);
	System.out.println(s1);
	for(int i=0;i<outcomeList.length;i++)
	{
		if(outcomeList[i].getDate().equals(date))
		System.out.println(outcomeList[i].toString());
	}
}


}
