package skill;

/*
 * ¤p¤õÀs§Þ¯à
 */
public class CharmanderSkill extends Skill implements IFireSkill, INormalSkill {
	
	String[] skillList = {"", "", "", ""};
	
	public CharmanderSkill() {
		
		updateSkillList(5);
		
	}
	
	public CharmanderSkill(int level) {
		
		updateSkillList(level);
		
	}
	
	void updateSkillList(int level) {
		
		skillList[0] = "Tackle";
		skillList[1] = "Ember";
		
		if(level >= 35) {
			skillList[2] = "Flame";
		}
		if(level >= 60) {
			skillList[3] = "Explosion";
		}
		
	}
	
	public double useSkill(int skillNo, String name, double atk, double sAtk) {
		
		switch(skillNo) {
		case 1:
			return Tackle(name, atk);
		case 2:
			return Ember(name, sAtk);
		default:
			return 0;
		}
	}
	
	@Override
	public String[] getSkillList() {
		return skillList;
	}
	
	@Override
	public double Tackle(String name,double atk) {
		System.out.println(name + " use Tackle!");
		return atk * 0.4;
	}

	@Override
	public double Ember(String name,double sAtk) {
		System.out.println(name + " use Ember!");
		return sAtk * 0.5;
	}

}
