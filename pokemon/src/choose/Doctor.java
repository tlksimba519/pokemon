package choose;

import pokemon.Charmander;
import pokemon.Pokemon;
import pokemon.Squirtle;

/*
 * 博士工廠(膽單工廠ver) 
 * 負責根據訓練家回覆分配寶可夢
 */
public class Doctor {
	
	public static Pokemon choosePokemon(Pokemons choice) {
		
		switch(choice) {
			case Charmander :
				return new Charmander();
			case Squirtle :
				return new Squirtle();
			case Bulbasaur :
				return null;
			default :
				return null;
				
		}
		
	}

}
