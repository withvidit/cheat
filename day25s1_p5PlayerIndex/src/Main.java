import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String skill;
		
		Scanner scanner = new Scanner(System.in);
		String yn="";
		HashSet <Player> hsSet =new HashSet<Player>();
		do {
			int flag = 0;
			System.out.println("Enter Player Name:");
			name=scanner.nextLine();
			System.out.println("Enter Skill:");
			skill=scanner.nextLine();
			
			for (Iterator iterator = hsSet.iterator(); iterator.hasNext();) {
				Player player = (Player) iterator.next();
				if (player.equals( new Player(name, skill))) {
					System.out.println("Player "+name+" already exist");
					flag++;
				}
			}
			if (flag==0) {
				hsSet.add(new Player(name, skill));
			}			
			
			System.out.println("Do you want to continue(yes/no):");
			yn=scanner.nextLine();
			
			
		} while (yn.equals("yes"));
		if (yn.equals("no")) {
			IndexBuilder iBuilder= new IndexBuilder();
			TreeSet<Index> tSet=new TreeSet<Index>(iBuilder.buildIndex(hsSet));
			
			iBuilder.displayIndex(tSet);
		}
	}

}
