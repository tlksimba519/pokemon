package main;

import utility.EnumConvert;

public enum Lobby implements EnumConvert {
	
	Battle("Battle"),
	Interact("Interact");
	
	private String status;
	
	Lobby(String status) {
		
		this.status = status;
		
	}
	
	public static Lobby convert(String input) {
		
		if(input!=null) {
			
			if(input.equalsIgnoreCase(Battle.toString())) {
				return Battle;
			}
			if(input.equalsIgnoreCase(Interact.toString())) {
				return Interact;
			}
		}
		return null;
	}
	
}
