package skill;

/*
 * �ޯ��H�����O
 */
public abstract class Skill {
	
	String[] skillList = {"", "", "", ""};
	
	abstract void updateSkillList(int level);
	
	abstract String[] getSkillList();
	
	abstract double useSkill(int skillNo, String name, double atk, double sAtk);
	
}
