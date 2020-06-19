package pokemon;

import skill.*;

/*
 * 小火龍物件
 */
public class Squirtle extends Pokemon implements IWaterSkill, INormalSkill {

	final private static String name = "Squirtle";
	private int level = 5; //起始等級
	private double exp = 0; //經驗值
	private int[] ability = {44, 48, 65, 50, 64, 43}; //初始值 依序為 血量, 攻擊, 防禦, 特攻, 特防, 速度
	private int hp = 44;
	private int atk = 48;
	private int def = 65;
	private int sAtk = 50;
	private int sDef = 64;
	private int spd = 43;
	private String[] skillList;
	
	//建構子
	public Squirtle() {
		
		super(name);
		
	}
	
	public Squirtle(int level) {
		
		super(name);
		this.level = level;
		updateAbility();
		
	}
	
	void updateAbility() {
		
		hp = ability[0] + (level-5) * 6 ; //HP曲線為6
		atk = ability[1] + (level-5) * 3 ; //攻擊曲線為3
		def = ability[2] + (level-5) * 5 ; //防禦曲線為5
		sAtk = ability[3] + (level-5) * 3 ; //特攻曲線為3
		sDef = ability[4] + (level-5) * 4 ; //特防曲線為4
		spd = ability[5] + (level-5) * 3 ; //速度曲線為3

	}
	
	void updateSkillList() {
		
		this.skillList[0] = "Tackle";
		this.skillList[1] = "Bubble";
	
	}
	
	public String getSkills(int i) {
		
		return skillList[i - 1];
		
	}
	
	/*
	 * 持有技能
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
