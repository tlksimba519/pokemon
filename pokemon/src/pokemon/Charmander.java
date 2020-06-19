package pokemon;

import skill.*;

/*
 * �p���s����
 */
public class Charmander extends Pokemon implements IFireSkill, INormalSkill {
	
	final private static String name = "Charmander"; //�رڦW��
	private String type = "fire"; //�ݩ�
	private int level = 5; //�_�l����
	private double exp = 0; //�g���
	private int[] ability = {39, 52, 43, 60, 50, 65}; //�̧Ǭ� ��q, ����, ���m, �S��, �S��, �t��
	private int hp = 39;
	private int atk = 52;
	private int def = 43;
	private int sAtk = 60;
	private int sDef = 50;
	private int spd = 65;
	private String[] skillList;
	
	//�غc�l 
	public Charmander(){
		
		super(name);
		
	}
	
	public Charmander(int level) {
		
		super(name);
		this.level = level;
		updateAbility();
		
	}
	
	void updateAbility() {
			
		hp = ability[0] + (level-5) * 5 ; //HP���u��5
		atk = ability[1] + (level-5) * 4 ; //�������u��4
		def = ability[2] + (level-5) * 3 ; //���m���u��3
		sAtk = ability[3] + (level-5) * 4 ; //�S�𦱽u��4
		sDef = ability[4] + (level-5) * 3 ; //�S�����u��3
		spd = ability[5] + (level-5) * 3 ; //�t�צ��u��3

	}
	
	void updateSkillList() {
				
		this.skillList[0] = "Tackle";
		this.skillList[1] = "Ember";
	
	}
	
	public String getSkills(int i) {
		
		return skillList[i - 1];
		
	}
	
	/*
	 * �����ޯ�
	 */
	@Override
	public double Tackle() { //����(���q�t)
		
		System.out.println(name + "use Tackle!");
		return atk * 0.5;
		
	}
	
	@Override
	public double Ember() { //����(���t)
		
		System.out.println(name + "use Ember!");
		return sAtk * 0.5;
		
	}
	
}
