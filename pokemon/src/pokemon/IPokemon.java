package pokemon;

/*
 * Ä_¥i¹Ú¤¶­±
 */
public interface IPokemon {
	
	void gainEXP(int gain);
	
	void levelUp();

	void setName(String listenTrainer);

	void callName();

	String getSkill(int i);
	
	double useSkill(int skillNo);
	
	void getHurt(double damage);
	
	double showHp();
	
}