package br.senai.sp.jandira.jogo;

public enum Consoles {

	
		XBOX("Xbox360"),
		XBOXONE("Xbox one"),
		XBOXSERIEX("Xbox X"),
		PLAYSTATIONONE("Playstation 1"),
		PLAYSTATIOTWO("Playstation 2"),
		PLAYSTATIOFOR("Playstation 4"),
		PLAYSTATIOFIVE("Playstation 5"),
		PLAYSTATION("Playstation 3"),
		NITENDO("Nitendo mario");
		
	
	private String consoles;

	 private Consoles(String string) {
		 this.consoles = string;
		 
		
	}
	 
	public String getconsole() {
		return consoles;

	}
	 

	
}
