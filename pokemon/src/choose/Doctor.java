package choose;


import pokemon.Pokemon;

/*
 * �դh�u�t(�x��u�tver) 
 * �t�d�ھڰV�m�a�^�Ф��t�_�i��
 */
public class Doctor {
	
	public static Pokemon choosePokemon(Pokemons choice) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//�ϥΤϮg�ӫ�������
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
