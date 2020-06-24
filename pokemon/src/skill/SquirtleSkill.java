package skill;

/*
 * ³Ç¥§Àt§Þ¯à
 */
public class SquirtleSkill extends Skill implements IWaterSkill, INormalSkill {
	
	String[] skillList = {"", "", "", ""};
	
	public SquirtleSkill() {
		
		updateSkillList(5);
		
	}
	
	public SquirtleSkill(int level) {
		
		updateSkillList(level);
		
	}
	
	void updateSkillList(int level) {
		
		skillList[0] = "Tackle";
		skillList[1] = "Bubble";
		
		if(level >= 35) {
			skillList[2] = "WaterGun";
		}
		if(level >= 60) {
			skillList[3] = "Flood";
		}
		
	}
	
	public double useSkill(int skillNo, String name, double atk, double sAtk) {
		
		switch(skillNo) {
		case 1:
			return Tackle(name, atk);
		case 2:
			return Bubble(name, sAtk);
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
	public double Bubble(String name,double sAtk) {
		System.out.println(name + " use Bubble!");
		return sAtk * 0.5;
	}

}
