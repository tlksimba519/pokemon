package trainer;

import pokemon.IPokemon;

/*
 * �V�m�a����
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