 class Skill 
{
private String skill;
Skill(){}
Skill(String skill)
{
this.skill=skill;
}
 public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
public String toString()
    {
        String[] s={skill};
        return String.format("%s",s);
    }

}
