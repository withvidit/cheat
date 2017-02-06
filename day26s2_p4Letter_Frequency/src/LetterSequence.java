import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;


public class LetterSequence {
	
	private String sentence;
	
	public TreeMap<Character,Integer> computeFrequency()
	{
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		ArrayList<Character> Uchar= new ArrayList<Character>();
		ArrayList<Integer> Freq = new ArrayList<Integer>();
		
		char[] charseq= this.getSentence().toCharArray();
		//char[] charseq="Kohli is the man of the match".toCharArray();
		for(int i=0;i<charseq.length;i++)
		{
			Uchar.add(charseq[i]);
		}
		
		for(int i=0;i<charseq.length;i++)
		Freq.add(Collections.frequency(Uchar, charseq[i]));
		
		
		for(int i=0;i<charseq.length;i++)
		tm.put(charseq[i], Freq.get(i));
		
		//System.out.println(tm);
		
		
		
		
		return tm;
		
	}
	public void displayLetterFrequency(TreeMap<Character,Integer> frequencyMap)
	{
		for(Map.Entry<Character,Integer> entry: frequencyMap.entrySet())
		{
			char x=entry.getKey();
			if(x!=' ')
			{
			System.out.print(x+" : ");
			for(int i=0;i<entry.getValue();i++)
			{
				System.out.print("*");
			}
			System.out.println();
			}
		}
	}
	public LetterSequence(String sentence) {
		super();
		this.sentence = sentence;
	}
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	

}
