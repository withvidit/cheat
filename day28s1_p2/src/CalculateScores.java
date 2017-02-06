import java.util.Arrays;


public class CalculateScores implements Runnable {
	
	String matchType,scoreString;
	int[] scores;
	double meanScore;
	int minScore,maxScore;
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
	public int[] getScores() {
		return scores;
	}
	public void setScores() {
		this.scores = scores;
	}
	public double getMeanScore() {
		int sum=0;
		for (int i = 0; i < scores.length; i++) {
			sum+=scores[i];
		}
		this.meanScore=(double)sum/scores.length;
		return this.meanScore;
	}
	public void setMeanScore() {
		int sum=0;
		for (int i = 0; i < scores.length; i++) {
			sum+=scores[i];
		}
		this.meanScore=(double)sum/scores.length;
	}
	public int getMinScore() {
		return scores[0];
	}
	public void setMinScore() {
		this.minScore = scores[0];
	}
	public int getMaxScore() {
		return scores[scores.length-1];
	}
	public void setMaxScore(int[] scores) {
		this.maxScore = scores[scores.length-1];
	}
	public CalculateScores(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	public void run() {
		int i=0;
		scores=new int[scoreString.split(",").length];
		for(String s:scoreString.split(","))
			scores[i++]=Integer.parseInt(s);
		Arrays.sort(scores);
		
	}
	
	
	
	

}
