package pokemon;

import skill.CharmanderSkill;

/*
 * �p���s����
 */
public class Charmander extends Pokemon {
	
	final private static String name = "Charmander"; //�رڦW��
	private String type = "fire"; //�ݩ�
	private int level = 5; //�_�l����
	private double exp = 0; //�g���
	private double[] ability = {39, 52, 43, 60, 50, 65}; //�̧Ǭ� ��q, ����, ���m, �S��, �S��, �t��
	private double hp = 39;
	private double atk = 52;
	private double def = 43;
	private double sAtk = 60;
	private double sDef = 50;
	private double spd = 65;
	CharmanderSkill CharmanderSkill;
	
	//�غc�l 
	public Charmander() {
		
		super(name);
		this.CharmanderSkill = new CharmanderSkill();
		updateAbility();
		
	}
	
	public Charmander(int level) {
		
		super(name);
		this.level = level;
		this.CharmanderSkill = new CharmanderSkill(level);
		updateAbility();
		
	}
	
	void updateAbility() {
			
		hp = ability[0] + (level - 5) * 5 ; //HP���u��5
		atk = ability[1] + (level - 5) * 4 ; //�������u��4
		def = ability[2] + (level - 5) * 3 ; //���m���u��3
		sAtk = ability[3] + (level - 5) * 4 ; //�S�𦱽u��4
		sDef = ability[4] + (level - 5) * 3 ; //�S�����u��3
		spd = ability[5] + (level - 5) * 3 ; //�t�צ��u��3

	}

	@Override
	public String getSkill(int i) {
		return (CharmanderSkill.getSkillList())[i];
	}

	@Override
	public double useSkill(int skillNo) {
		return CharmanderSkill.useSkill(skillNo, name, atk, sAtk);
	}
	
	@Override
	public double showHp() {
		return hp;
	}

	@Override
	public void getHurt(double damage) {
		// TODO Auto-generated method stub
		
	}

}