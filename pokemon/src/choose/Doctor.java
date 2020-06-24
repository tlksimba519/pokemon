package choose;


import pokemon.Pokemon;

/*
 * 博士工廠(膽單工廠ver) 
 * 負責根據訓練家回覆分配寶可夢
 */
public class Doctor {
	
	public static Pokemon choosePokemon(Pokemons choice) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//使用反射來指派物件
		Class<?> c = Class.forName(choice.pokemonClass);
		return (Pokemon) c.newInstance();
		
//		switch(choice) {
//			case Charmander :
//				return new Charmander();
//			case Squirtle :
//				return new Squirtle();
//			case Bulbasaur :
//				return new Bulbasaur();
//			default :
//				return null;
//				
//		}
		
	}

}
