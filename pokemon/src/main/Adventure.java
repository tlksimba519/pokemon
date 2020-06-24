package main;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import battle.Battle;
import choose.Doctor;
import choose.Pokemons;
import trainer.Trainer;
import utility.Conversation;

/*
 * �D�{��
 */
public class Adventure {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Conversation.talkToTrainer("�w��Ө��_�i�ڥ@��!");
		Conversation.talkToTrainer("�п�ܧA�Q�n���_�i��!");
		Conversation.talkToTrainer("Charmander(�p���s)");
		Conversation.talkToTrainer("Squirtle(�ǥ��t)");
		Conversation.talkToTrainer("Bulbasaur(����ؤl)");
		
		Trainer you = new Trainer(Doctor.choosePokemon(Pokemons.convert(Conversation.listenTrainer())));
		
		Conversation.talkToTrainer("�n���L���W�r��? Y/N");
		
		switch(Conversation.listenTrainer()) {
			case "Y" :
				Conversation.talkToTrainer("��J�W�r�a!");
				you.getBuddy().setName(Conversation.listenTrainer());
				break;
			case "N" :
				Conversation.talkToTrainer("���N�X�o�_�I�a!");
				break;
			default :
				Conversation.talkToTrainer("�O�x�F!");
				break;
		}
		
		boolean lobby = true;
		while(lobby) {
			
			Conversation.talkToTrainer("�j�U\n---------------");
			Conversation.talkToTrainer("���");
			Conversation.talkToTrainer("����");
			
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