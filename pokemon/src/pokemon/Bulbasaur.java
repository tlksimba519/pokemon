package pokemon;

import skill.BulbasaurSkill;
import utility.Conversation;

/*
 * ����ؤl����
 */
public class Bulbasaur extends Pokemon {
	
	final private static String name = "Bulbasaur"; //�رڦW��
	private String type = "grass"; //�ݩ�
	private int level = 5; //�_�l����
	private double exp = 0; //�g���
	private double[] ability = {45, 49, 49, 65, 65, 45}; //�̧Ǭ� ��q, ����, ���m, �S��, �S��, �t��
	private double hp = 45;
	private double atk = 49;
	private double def = 49;
	private double sAtk = 65;
	private double sDef = 65;
	private double spd = 45;
	BulbasaurSkill BulbasaurSkill;
	
	//�غc�l 
	public Bulbasaur(){
		
		super(name);
		super.hp = hp;
		this.BulbasaurSkill = new BulbasaurSkill();
		updateAbility();
		
	}
	
	public Bulbasaur(int level) {
		
		super(name);
		this.level = level;
		this.BulbasaurSkill = new BulbasaurSkill(level);
		updateAbility();
		
	}
	
	void updateAbility() {
			
		hp = ability[0] + (level - 5) * 5 ; //HP���u��5
		atk = ability[1] + (level - 5) * 4 ; //�������u��4
		def = ability[2] + (level - 5) * 4 ; //���m���u��3
		sAtk = ability[3] + (level - 5) * 5 ; //�S�𦱽u��4
		sDef = ability[4] + (level - 5) * 5 ; //�S�����u��3
		spd = ability[5] + (level - 5) * 3 ; //�t�צ��u��3
		super.hp = hp;

	}
	
	public String getSkill(int i) {
		return (BulbasaurSkill.getSkillList())[i];
	}

	public double useSkill(int skillNo) {
		return BulbasaurSkill.useSkill(skillNo, name, atk, sAtk);
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