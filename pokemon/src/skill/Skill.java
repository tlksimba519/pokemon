package skill;

/*
 * 技能抽象父類別
 */
public abstract class Skill {
	
	String[] skillList = {"", "", "", ""};
	
	abstract void updateSkillList(int level);
	
	abstract String[] getSkillList();
	
	abstract double useSkill(int skillNo, String name, double atk, double sAtk);
	
}
