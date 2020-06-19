package pokemon;

/*
 * �_�i�ک�H�����O
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
	
	//��o�g���
	void gainEXP(int gain) {
			
		exp += gain;
		if(exp > level * 50) { //�g�禱�u��50
			
			levelUp();
			exp = 0;
			
		}
		
	}
	
	//��O�ȧ�s
	abstract void updateAbility();
			
	//�ɯ�
	void levelUp() {
		
		level++;
		updateAbility();
			
	}
	
	//�ޯ���s
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