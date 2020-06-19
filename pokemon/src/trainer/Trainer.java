package trainer;

import pokemon.Pokemon;

public class Trainer {
	
	private Pokemon hadTrainer;
	
	public Trainer(Pokemon given) {
		
		this.setBuddy(given);
	
	}

	public Pokemon getBuddy() {
		return hadTrainer;
	}

	public void setBuddy(Pokemon hadTrainer) {
		
		this.hadTrainer = hadTrainer;
		
	}

}