package battle;

import trainer.Trainer;
import utility.Conversation;

import java.io.IOException;

import pokemon.*;

public class Battle {

	public static void battle(Trainer you) throws IOException {
		boolean continueBattle = true;
		while(continueBattle) {
			Trainer enemy = new Trainer(new Squirtle(30));
			int roundCount = 1;
			boolean round = true;
			while(round) {
				Conversation.talkToTrainer(("第" + Integer.toString(roundCount) + "回合"));
				Conversation.talkToTrainer("選擇招式", you.getBuddy().getSkills(0), 
						you.getBuddy().getSkills(1));
				switch(Conversation.listenTrainer()) {
					case "Tackle":
						((Squirtle) you.getBuddy()).Tackle();
						break;
					case "Ember":
						((Charmander) you.getBuddy()).Ember();
						break;
					case "Bubble":
						((Squirtle) you.getBuddy()).Bubble();
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
