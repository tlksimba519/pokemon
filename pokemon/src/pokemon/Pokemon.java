package pokemon;

import utility.Conversation;

/*
 * �_�i�ک�H�����O
 */
abstract public class Pokemon implements IPokemon{
	protected String name;
	protected int level;
	protected double exp;
	protected double hp;

	
	Pokemon(String name) {
		
		this.name = name;
		
	}
	
	Pokemon(String name, int level) {
		
		this.name = name;
		this.level = level;
		
	}
	
	//��o�g���
	public void gainEXP(int gain) {
			
		exp += gain;
		if(exp > level * 50) { //�g�禱�u��50
			
			levelUp();
			exp = 0;
			
		}
		
	}
			
	//�ɯ�
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
		
	//��O�ȧ�s
	abstract void updateAbility();
	
//	public void getHurt(double damage) {
//		
//		double critOrMiss = Math.random() * 100;
//		
//		if(critOrMiss > 68) {
//			damage = damage * 1.5;
//			Conversation.talkToTrainer("����!!!");
//		} else if(critOrMiss < 30) {
//			damage = damage * 0;
//			Conversation.talkToTrainer("�����Q�{�}�F!!!");
//		} else {
//			
//		}
//		
//		hp = hp - damage;
//		
//	}

}