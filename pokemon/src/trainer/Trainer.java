package trainer;

import pokemon.Pokemon;

/*
 * °V½m®aª«¥ó
 */
public class Trainer {
	
	private Pokemon hadTrainer;
	
	public Trainer(Pokemon pokemon) {
		
		this.setBuddy(pokemon);
	
	}

	public Pokemon getBuddy() {
		return hadTrainer;
	}

	public void setBuddy(Pokemon pokemon) {
		
		this.hadTrainer = pokemon;
		
	}

}