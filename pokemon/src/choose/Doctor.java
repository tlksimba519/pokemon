package choose;

import pokemon.Charmander;
import pokemon.Pokemon;
import pokemon.Squirtle;

/*
 * �դh�u�t(�x��u�tver) 
 * �t�d�ھڰV�m�a�^�Ф��t�_�i��
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
