package pokemon;

/*
 * 寶可夢抽象父類別
 */
abstract public class Pokemon {
	String name;
	int level;
	double exp;
	double hp;

	
	Pokemon(String name) {
		
		this.name = name;
		
	}
	
	Pokemon(String name, int level) {
		
		this.name = name;
		this.level = level;
		
	}
	
	//獲得經驗值
	public void gainEXP(int gain) {
			
		exp += gain;
		if(exp > level * 50) { //經驗曲線為50
			
			levelUp();
			exp = 0;
			
		}
		
	}
			
	//升級
	public void levelUp() {
		
		level++;
		updateAbility();
			
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void callName() {
		
		System.out.println(name + " here!");
		
	}
		
	//能力值更新
	abstract void updateAbility();
	
//	public void getHurt(double damage) {
//		
//		double critOrMiss = Math.random() * 100;
//		
//		if(critOrMiss > 68) {
//			damage = damage * 1.5;
//			Conversation.talkToTrainer("暴擊!!!");
//		} else if(critOrMiss < 30) {
//			damage = damage * 0;
//			Conversation.talkToTrainer("攻擊被閃開了!!!");
//		} else {
//			
//		}
//		
//		hp = hp - damage;
//		
//	}
	public abstract void getHurt(double damage);
	public abstract String showHp();
	
	public abstract String getSkill(int i);
	public abstract double useSkill(int skillNo);



}