
public class Player implements Comparable<Player> {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	public int compareTo(Player arg0) {
		if(this.getName().equals(arg0.getName()))  
			return 0;  
			else  
			return 1;  
			
	}


	public String toString() {
		return "--" + this.getName()+"\n";
	}
	
	

}
