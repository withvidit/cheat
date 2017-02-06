import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;


public class TeamComparator implements Comparator<Team> {

	public int compare(Team t1,Team t2) {
		if(t1.getNumberOfMatches()==t2.getNumberOfMatches())
		return 0;
		else if(t1.getNumberOfMatches()>t2.getNumberOfMatches())
			return 1;
		else
			return -1;
		
	}

	

}
