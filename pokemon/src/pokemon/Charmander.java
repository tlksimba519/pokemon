package pokemon;

import skill.CharmanderSkill;
import utility.Conversation;

/*
 * 小火龍物件
 */
public class Charmander extends Pokemon {
	
	final private static String name = "Charmander"; //種族名稱
	private String type = "fire"; //屬性
	private int level = 5; //起始等級
	private double exp = 0; //經驗值
	private double[] ability = {39, 52, 43, 60, 50, 65}; //依序為 血量, 攻擊, 防禦, 特攻, 特防, 速度
	private double hp = 39;
	private double atk = 52;
	private double def = 43;
	private double sAtk = 60;
	private double sDef = 50;
	private double spd = 65;
	CharmanderSkill CharmanderSkill;
	
	//建構子 
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
			
		hp = ability[0] + (level - 5) * 5 ; //HP曲線為5
		atk = ability[1] + (level - 5) * 4 ; //攻擊曲線為4
		def = ability[2] + (level - 5) * 3 ; //防禦曲線為3
		sAtk = ability[3] + (level - 5) * 4 ; //特攻曲線為4
		sDef = ability[4] + (level - 5) * 3 ; //特防曲線為3
		spd = ability[5] + (level - 5) * 3 ; //速度曲線為3

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
			return (name + " 被擊敗了!");
		}
		return Double.toString(hp);
	}
//
	public void getHurt(double damage) {
		
		double critOrMiss = Math.random() * 100;
		
		if(critOrMiss > 68) {
			damage = damage * 1.5;
			Conversation.talkToTrainer("暴擊!!!");
		} else if(critOrMiss < 30) {
			damage = damage * 0;
			Conversation.talkToTrainer("攻擊被閃開了!!!");
		} else {
			
		}
		
		hp = hp - damage;
		
	}

}