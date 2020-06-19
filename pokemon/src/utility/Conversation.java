package utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversation {
	
	public static String listenTrainer() throws IOException {
		
		return new BufferedReader(new InputStreamReader(System.in)).readLine();
		
	}
	
	public static void talkToTrainer(String wantToSay) {
		
		System.out.println(wantToSay);
		
	}
	
	public static void talkToTrainer(String...strings) {
		
		for(String wantToSay : strings) {
			
			System.out.println(wantToSay);
			
		}
		
	}

}
