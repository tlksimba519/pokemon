package skill;

/*
 * 妙蛙種子技能
 */
public class BulbasaurSkill extends Skill implements IGrassSkill, INormalSkill {
	
	String[] skillList = {"", "", "", ""};
	
	public BulbasaurSkill() {
		
		updateSkillList(5);
		
	}
	
	public BulbasaurSkill(int level) {
		
		updateSkillList(level);
		
	}
	
	void updateSkillList(int level) {
		
		skillList[0] = "Tackle";
		skillList[1] = "VineWhip";
		
		if(level >= 35) {
			skillList[2] = "RazorLeaf";
		}
		if(level >= 60) {
			skillList[3] = "SolarBeam";
		}
		
	}
	
	public double useSkill(int skillNo, String name, double atk, double sAtk) {
		
		switch(skillNo) {
		case 1:
			return Tackle(name, atk);
		case 2:
			return VineWhip(name, sAtk);
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
	public double VineWhip(String name,double sAtk) {
		System.out.println(name + " use VineWhip!");
		return sAtk * 0.5;
	}

}
