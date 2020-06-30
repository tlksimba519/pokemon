package pokemon;

import skill.SquirtleSkill;
import utility.Conversation;

/*
 * 傑尼龜物件
 */
public class Squirtle extends Pokemon {

	final private static String name = "Squirtle";
	private String type = "water"; //屬性
	private int level = 5; //起始等級
	private double exp = 0; //經驗值
	private double[] ability = {44, 48, 65, 50, 64, 43}; //初始值 依序為 血量, 攻擊, 防禦, 特攻, 特防, 速度
	double hp = 44;
	private double atk = 48;
	private double def = 65;
	private double sAtk = 50;
	private double sDef = 64;
	private double spd = 43;
	SquirtleSkill SquirtleSkill;
	
	//建構子
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
		
		hp = ability[0] + (level - 5) * 6 ; //HP曲線為6
		atk = ability[1] + (level - 5) * 3 ; //攻擊曲線為3
		def = ability[2] + (level - 5) * 5 ; //防禦曲線為5
		sAtk = ability[3] + (level - 5) * 3 ; //特攻曲線為3
		sDef = ability[4] + (level - 5) * 4 ; //特防曲線為4
		spd = ability[5] + (level - 5) * 3 ; //速度曲線為3

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