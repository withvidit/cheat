import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class IndexBuilder {
	
	public TreeSet<Index> buildIndex(HashSet<Player> hs) {
		TreeSet<Index> tSet= new TreeSet<Index>();
		for (Iterator iterator = hs.iterator(); iterator.hasNext();) {
			Player player = (Player) iterator.next();
			if (findIndex(tSet, player.getName().charAt(0))==null)
			{
				tSet.add(new Index(player.getName().toUpperCase().charAt(0), 1));
			}
			else {
				Index ind =findIndex(tSet, player.getName().toUpperCase().charAt(0));
				int count=ind.getCount();
				//System.out.println(count);
				tSet.remove(ind);
				tSet.add(new Index(player.getName().toUpperCase().charAt(0), count+1));
			}
		}
		
		/*for (Iterator iterator = tSet.iterator(); iterator.hasNext();) {
			Index index = (Index) iterator.next();
			System.out.println(index.getCh()+"\t"+index.getCount());
		}*/
		return tSet;
		
	}
	
	public void displayIndex(TreeSet<Index> tSet) {
		//Index ind=findIndex(tSet, 'V');
		//System.out.println();
		System.out.println(String.format("%-14s%-15s","Player", "Index")); 
		for (Iterator iterator = tSet.iterator(); iterator.hasNext();) {
			Index index = (Index) iterator.next();
			System.out.println(String.format("%-15s%-15d",index.getCh(), index.getCount())); 
		}
	}
	
	private Index findIndex(TreeSet<Index> tSet,char ch) {
		for (Iterator iterator = tSet.iterator(); iterator.hasNext();) {
			Index index = (Index) iterator.next();
			if (index.getCh()==(""+ch).toUpperCase().charAt(0)) {
				//System.out.println("found\t"+index.getCh());
				return index;
			}
			else {
				//System.out.println("Nop\t"+index.getCh());
			}
		}
		
		return null;
		
	}
	public IndexBuilder() {
		// TODO Auto-generated constructor stub
	}
	

}
