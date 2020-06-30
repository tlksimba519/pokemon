package pokemon;

import skill.CharmanderSkill;
import utility.Conversation;

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

	public String getSkill(int i) {
		return (CharmanderSkill.getSkillList())[i];
	}

	public double useSkill(int skillNo) {
		return CharmanderSkill.useSkill(skillNo, name, atk, sAtk);
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