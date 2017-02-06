import java.util.Arrays;

public class SortScore extends Thread {
	String matchType,scoreString;
	
	public SortScore(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	int scores[]=new int[5];
	public void run() {
		//this.getScores();
		
	}
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public String getScoreString() {
		return scoreString;
	}
	public void setScoreString(String scoreString) {
		this.scoreString = scoreString;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	public int[] getScores() {
		String score[]=this.scoreString.split(",");
		for(int i=0;i<score.length;i++){
			scores[i]=Integer.parseInt(score[i]);
		}
		Arrays.sort(scores);
		return scores;
	}
}
