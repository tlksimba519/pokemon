package choose;

import utility.EnumConvert;

public enum Pokemons implements EnumConvert {
	
	Charmander("Charmander"),
	Squirtle("Squirtle"),
	Bulbasaur("Bulbasaur");
	
	private String pokemon;
	
	Pokemons(String pokemon) {
		
		this.pokemon = pokemon;
		
	}
	
	public static Pokemons convert(String input) {
		if(input!=null) {
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
