
public class Team {
 public String name,coach,location ,players,captain;
 
 
 public void setName(String s)
 {
	 this.name=s;
 }
 public void setCoach(String s)
 {
	 this.coach=s;
 }
 public void setLocation(String s)
 {
	 this.location=s;
 }
 public void setPlayers(String s)
 {
	 this.players=s;
 }
 public void setCaptain(String s)
 {
	 this.captain=s;
 }
 
 public String getName()
 {
	 return this.name;
 }
 public String getCoach()
 {
	 return this.coach;
 }
 public String getLocation()
 {
	 return this.location;
 }
 public String getPlayers()
 {
	 return this.players;
 }
 public String getCaptain()
 {
	 return this.captain;
 }
 
 
 public Team(String name,String coach,String location, String players,String captain)
  {
	 this.name=name;
	 this.coach=coach;
	 this.location=location;
	 this.players=players;
	 this.captain=captain;
 }
 public Team()
 {
	 this.name="";
	 this.coach="";
	 this.location="";
	 this.players="";
	 this.captain="";
 }
 
 
public void displayTeamDetails()
 {
	 System.out.println("Team : "+getName()+"\nCoach : "+getCoach()+"\nLocation : "+getLocation()+"\nPlayers : "+getPlayers()+"\nCaptain : "+getCaptain());
 }
}
