import java.util.ArrayList;
import java.util.Collections;


public class Team {
String name;

ArrayList<Player> playerList= new  ArrayList<Player>();

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public ArrayList<Player> getPlayerList() {
	
	Collections.sort(this.playerList);
	return playerList;
}



public void setPlayerList(ArrayList<Player> playerList) {
	this.playerList = playerList;
}

public Team(String name) {
	super();
	this.name = name;
}
public void addPlayer(String playername)
{
	playerList.add(new Player(playername));
}

@Override
public String toString() {
	Collections.sort(this.getPlayerList());
	return name + "\n" + this.getPlayerList().toString();
}


}
