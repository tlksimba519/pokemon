package pokemon;

import skill.BulbasaurSkill;

/*
 * 妙蛙種子物件
 */
public class Bulbasaur extends Pokemon {
	
	final private static String name = "Bulbasaur"; //種族名稱
	private String type = "grass"; //屬性
	private int level = 5; //起始等級
	private double exp = 0; //經驗值
	private double[] ability = {45, 49, 49, 65, 65, 45}; //依序為 血量, 攻擊, 防禦, 特攻, 特防, 速度
	private double hp = 45;
	private double atk = 49;
	private double def = 49;
	private double sAtk = 65;
	private double sDef = 65;
	private double spd = 45;
	BulbasaurSkill BulbasaurSkill;
	
	//建構子 
	public Bulbasaur(){
		
		super(name);
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
			
		hp = ability[0] + (level - 5) * 5 ; //HP曲線為5
		atk = ability[1] + (level - 5) * 4 ; //攻擊曲線為4
		def = ability[2] + (level - 5) * 4 ; //防禦曲線為3
		sAtk = ability[3] + (level - 5) * 5 ; //特攻曲線為4
		sDef = ability[4] + (level - 5) * 5 ; //特防曲線為3
		spd = ability[5] + (level - 5) * 3 ; //速度曲線為3

	}
	
	@Override
	public String getSkill(int i) {
		return (BulbasaurSkill.getSkillList())[i];
	}

	@Override
	public double useSkill(int skillNo) {
		return BulbasaurSkill.useSkill(skillNo, name, atk, sAtk);
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