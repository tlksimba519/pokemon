package main;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import battle.Battle;
import choose.Doctor;
import choose.Pokemons;
import trainer.Trainer;
import utility.Conversation;

/*
 * 主程式
 */
public class Adventure {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Conversation.talkToTrainer("歡迎來到寶可夢世界!");
		Conversation.talkToTrainer("請選擇你想要的寶可夢!");
		Conversation.talkToTrainer("Charmander(小火龍)");
		Conversation.talkToTrainer("Squirtle(傑尼龜)");
		Conversation.talkToTrainer("Bulbasaur(妙蛙種子)");
		
		Trainer you = new Trainer(Doctor.choosePokemon(Pokemons.convert(Conversation.listenTrainer())));
		
		Conversation.talkToTrainer("要幫他取名字嗎? Y/N");
		
		switch(Conversation.listenTrainer()) {
			case "Y" :
				Conversation.talkToTrainer("輸入名字吧!");
				you.getBuddy().setName(Conversation.listenTrainer());
				break;
			case "N" :
				Conversation.talkToTrainer("那就出發冒險吧!");
				break;
			default :
				Conversation.talkToTrainer("別鬧了!");
				break;
		}
		
		boolean lobby = true;
		while(lobby) {
			
			Conversation.talkToTrainer("大廳\n---------------");
			Conversation.talkToTrainer("對戰");
			Conversation.talkToTrainer("互動");
			
			switch(Lobby.convert(Conversation.listenTrainer())) {
				case Battle :
					Battle.battle(you);
					break;
				case Interact :
					you.getBuddy().callName();
					Conversation.talkToTrainer(you.getBuddy().showHp());
				default :
					break;
			}
			
		}
		you.getBuddy().callName();
	}

}