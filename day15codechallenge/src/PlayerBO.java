 class PlayerBO {
     void viewDetails(Player[] playerList)
    	{
    	System.out.println("Player Details");
    	String[] s={"Name","Country","Skill"};
      String sq=String.format("%-15s %-15s %s",s);
      System.out.println(sq);
 		for(int i=0;i<playerList.length;i++)
 		{
 			System.out.println(playerList[i].toString());
 		}
   	 }
    void printPlayerDetailsWithSkill(Player[] playerList,Skill[] skillList,String skill)
	{
    	System.out.println("Skill Details");
    	String[] s={"Name","Country","Skill"};
      String sq=String.format("%-15s %-15s %s",s);
      System.out.println(sq);
		for(int i=0;i<playerList.length;i++)
		{
			if(skillList[i].getSkill().equals(skill))
			{
				System.out.println(playerList[i].toString());
			}
		}
	}
}
