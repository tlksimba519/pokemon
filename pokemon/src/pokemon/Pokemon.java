package pokemon;

/*
 * 寶可夢抽象父類別
 */
abstract public class Pokemon {
	protected String name;
	String type;
	protected int level;
	double exp;
	private int[] ability;
	private int hp;
	private int atk;
	private int def;
	private int sAtk;
	private int sDef;
	private int spd;
	private String[] skillList;
	
	
	Pokemon(String name) {
		
		this.name = name;
		
	}
	
	Pokemon(String name,int level) {
		
		this.name = name;
		this.level = level;
		
	}
	
	//獲得經驗值
	void gainEXP(int gain) {
			
		exp += gain;
		if(exp > level * 50) { //經驗曲線為50
			
			levelUp();
			exp = 0;
			
		}
		
	}
	
	//能力值更新
	abstract void updateAbility();
			
	//升級
	void levelUp() {
		
		level++;
		updateAbility();
			
	}
	
	//技能表更新
	abstract void updateSkillList();
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	String getName() {
		
		return name;
		
	}
	
	public void callName() {
		
		System.out.println(name + " here!");
		
	}
	
	public abstract String getSkills(int i);
		
	

}