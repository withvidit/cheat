
public class Innings {
	private String battingTeam;
	private long runs;
	public String getBattingTeam() {
		return battingTeam;
	}
	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public Innings(String battingTeam, long runs) {
		
		this.battingTeam = battingTeam;
		this.runs = runs;
	}
	public Innings()
	{
		
	}
	public String toString() {
		
		String[] a={getBattingTeam(),Long.toString(getRuns())};
		//		System.out.println(a[0]+"\n"+a[1]);
		String s= String.format("%-20s %-20s",a );
		
		return s;
		
	}
	
	

}
