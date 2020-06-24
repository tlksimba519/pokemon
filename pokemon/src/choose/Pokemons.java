package choose;

import utility.EnumConvert;

public enum Pokemons implements EnumConvert {
	
	Charmander("pokemon.Charmander"),
	Squirtle("pokemon.Squirtle"),
	Bulbasaur("pokemon.Bulbasaur");
	
	String pokemonClass;
	
	Pokemons(String pokemonClass) {
		
		this.pokemonClass = pokemonClass;
				
	}
	
	public static Pokemons convert(String input) {
		
		if(input != null) {
			
			if(input.equalsIgnoreCase(Charmander.toString())) {
				
				return Charmander;
			
			}
			if(input.equalsIgnoreCase(Squirtle.toString())) {
				
				return Squirtle;
				
			}
			if(input.equalsIgnoreCase(Bulbasaur.toString())) {
				
				return Bulbasaur;
				
			}
			
		}
		return null;
	}

}
