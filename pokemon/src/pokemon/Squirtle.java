package pokemon;

import skill.*;

/*
 * �p���s����
 */
public class Squirtle extends Pokemon implements IWaterSkill, INormalSkill {

	final private static String name = "Squirtle";
	private int level = 5; //�_�l����
	private double exp = 0; //�g���
	private int[] ability = {44, 48, 65, 50, 64, 43}; //��l�� �̧Ǭ� ��q, ����, ���m, �S��, �S��, �t��
	private int hp = 44;
	private int atk = 48;
	private int def = 65;
	private int sAtk = 50;
	private int sDef = 64;
	private int spd = 43;
	private String[] skillList;
	
	//�غc�l
	public Squirtle() {
		
		super(name);
		
	}
	
	public Squirtle(int level) {
		
		super(name);
		this.level = level;
		updateAbility();
		
	}
	
	void updateAbility() {
		
		hp = ability[0] + (level-5) * 6 ; //HP���u��6
		atk = ability[1] + (level-5) * 3 ; //�������u��3
		def = ability[2] + (level-5) * 5 ; //���m���u��5
		sAtk = ability[3] + (level-5) * 3 ; //�S�𦱽u��3
		sDef = ability[4] + (level-5) * 4 ; //�S�����u��4
		spd = ability[5] + (level-5) * 3 ; //�t�צ��u��3

	}
	
	void updateSkillList() {
		
		this.skillList[0] = "Tackle";
		this.skillList[1] = "Bubble";
	
	}
	
	public String getSkills(int i) {
		
		return skillList[i - 1];
		
	}
	
	/*
	 * �����ޯ�
	 */
	@Override
	public double Tackle() {
		
		System.out.println(name + "use Tackle!");
		return ability[1] * 0.5;
		
	}
	
	@Override
	public double Bubble() {
		
		System.out.println(name + "use Bubble!");
		return ability[3] * 0.5;
		
	}
	
}
