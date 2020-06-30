package pokemon;

import skill.SquirtleSkill;
import utility.Conversation;

/*
 * �ǥ��t����
 */
public class Squirtle extends Pokemon {

	final private static String name = "Squirtle";
	private String type = "water"; //�ݩ�
	private int level = 5; //�_�l����
	private double exp = 0; //�g���
	private double[] ability = {44, 48, 65, 50, 64, 43}; //��l�� �̧Ǭ� ��q, ����, ���m, �S��, �S��, �t��
	double hp = 44;
	private double atk = 48;
	private double def = 65;
	private double sAtk = 50;
	private double sDef = 64;
	private double spd = 43;
	SquirtleSkill SquirtleSkill;
	
	//�غc�l
	public Squirtle() {
		
		super(name);
		
		this.SquirtleSkill = new SquirtleSkill();
		updateAbility();
		
	}
	
	public Squirtle(int level) {
		
		super(name);
		this.level = level;
		this.SquirtleSkill = new SquirtleSkill(level);
		updateAbility();
		
	}
	
	void updateAbility() {
		
		hp = ability[0] + (level - 5) * 6 ; //HP���u��6
		atk = ability[1] + (level - 5) * 3 ; //�������u��3
		def = ability[2] + (level - 5) * 5 ; //���m���u��5
		sAtk = ability[3] + (level - 5) * 3 ; //�S�𦱽u��3
		sDef = ability[4] + (level - 5) * 4 ; //�S�����u��4
		spd = ability[5] + (level - 5) * 3 ; //�t�צ��u��3

	}
	
	public String getSkill(int i) {
		return (SquirtleSkill.getSkillList())[i];
	}

	public double useSkill(int skillNo) {
		return SquirtleSkill.useSkill(skillNo, name, atk, sAtk);
	}
//	
	public String showHp() {
		if(hp <= 0) {
			return (name + " �Q���ѤF!");
		}
		return Double.toString(hp);
	}
//	
	public void getHurt(double damage) {
		
		double critOrMiss = Math.random() * 100;
		
		if(critOrMiss > 68) {
			damage = damage * 1.5;
			Conversation.talkToTrainer("����!!!");
		} else if(critOrMiss < 30) {
			damage = damage * 0;
			Conversation.talkToTrainer("�����Q�{�}�F!!!");
		} else {
			
		}
		
		hp = hp - damage;
		
	}
	
}