package trainer;

import pokemon.IPokemon;

/*
 * °V½m®aª«¥ó
 */
public class Trainer {
	
	private IPokemon hadTrainer;
	
	public Trainer(IPokemon iPokemon) {
		
		this.setBuddy(iPokemon);
	
	}

	public IPokemon getBuddy() {
		return hadTrainer;
	}

	public void setBuddy(IPokemon iPokemon) {
		
		this.hadTrainer = iPokemon;
		
	}

}