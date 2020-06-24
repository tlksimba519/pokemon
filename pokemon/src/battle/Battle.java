package battle;

import java.io.IOException;

import pokemon.*;
import trainer.Trainer;
import utility.Conversation;

public class Battle {
	private static void fight(double damage, IPokemon defender) {
		defender.getHurt(damage);
	}
	public static void battle(Trainer you) throws IOException {
		
		boolean continueBattle = true;
		
		while(continueBattle) {
			
			Trainer enemy = new Trainer(new Squirtle(30));
			int roundCount = 1;
			boolean round = true;
			
			while(round) {
				
				Conversation.talkToTrainer(("第" + Integer.toString(roundCount) + "回合"));
				Conversation.talkToTrainer(Double.toString(enemy.getBuddy().showHp()));
				Conversation.talkToTrainer("選擇招式", "1." + you.getBuddy().getSkill(0), 
						"2." + you.getBuddy().getSkill(1),
						"3." + you.getBuddy().getSkill(2),
						"4." + you.getBuddy().getSkill(3));
				
				switch(Integer.parseInt((Conversation.listenTrainer()))) {
					case 1:
						fight(you.getBuddy().useSkill(1), enemy.getBuddy());
						break;
					case 2:
						fight(you.getBuddy().useSkill(2), enemy.getBuddy());
						break;
					case 3:
						you.getBuddy().useSkill(3);
						break;
					case 4:
						you.getBuddy().useSkill(4);
						break;
					default:
						round = false;
						break;
				}
				roundCount++;
			}
			
			Conversation.talkToTrainer("Continue? Y/N");
			
			if(Conversation.listenTrainer().equalsIgnoreCase("N")) {
				
				continueBattle = false;
				
			}
		}
	}
}