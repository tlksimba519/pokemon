package pokemon;

import skill.*;

/*
 * 小火龍物件
 */
public class Charmander extends Pokemon implements IFireSkill, INormalSkill {
	
	final private static String name = "Charmander"; //種族名稱
	private String type = "fire"; //屬性
	private int level = 5; //起始等級
	private double exp = 0; //經驗值
	private int[] ability = {39, 52, 43, 60, 50, 65}; //依序為 血量, 攻擊, 防禦, 特攻, 特防, 速度
	private int hp = 39;
	private int atk = 52;
	private int def = 43;
	private int sAtk = 60;
	private int sDef = 50;
	private int spd = 65;
	private String[] skillList;
	
	//建構子 
	public Charmander(){
		
		super(name);
		
	}
	
	public Charmander(int level) {
		
		super(name);
		this.level = level;
		updateAbility();
		
	}
	
	void updateAbility() {
			
		hp = ability[0] + (level-5) * 5 ; //HP曲線為5
		atk = ability[1] + (level-5) * 4 ; //攻擊曲線為4
		def = ability[2] + (level-5) * 3 ; //防禦曲線為3
		sAtk = ability[3] + (level-5) * 4 ; //特攻曲線為4
		sDef = ability[4] + (level-5) * 3 ; //特防曲線為3
		spd = ability[5] + (level-5) * 3 ; //速度曲線為3

	}
	
	void updateSkillList() {
				
		this.skillList[0] = "Tackle";
		this.skillList[1] = "Ember";
	
	}
	
	public String getSkills(int i) {
		
		return skillList[i - 1];
		
	}
	
	/*
	 * 持有技能
	 */
	@Override
	public double Tackle() { //撞擊(普通系)
		
		System.out.println(name + "use Tackle!");
		return atk * 0.5;
		
	}
	
	@Override
	public double Ember() { //火花(火系)
		
		System.out.println(name + "use Ember!");
		return sAtk * 0.5;
		
	}
	
}
