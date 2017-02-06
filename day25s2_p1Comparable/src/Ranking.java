
public class Ranking implements Comparable<Ranking> {
	String name;
	long score;
	public int compareTo(Ranking rank) {
		if(getScore()==rank.getScore())  
			return 0;  
			else if(this.getScore()>rank.getScore())  
			return 1;  
			else  
			return -1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}
	public Ranking(String name, long score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return " " + name + " " + score ;
	}
	
	
	

}
