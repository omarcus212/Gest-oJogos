package br.senai.sp.jandira.jogo;

public enum Consoles {

	Nintendo("Nintendo"),
	XboxOneS("Xbox One S "),
	Playstation2("Playstation 2") ,
	Playstation4("Playstation 4"),
	NintendoSwitch("Nintendo Switch"),
	XboxOneX("Xbox One X"),
	XboxSerieX("Xbox Serie X"),
	Playstation5("Playstation 5");

	private String Consoles;
	
	private Consoles(String Consoles) {
		this.Consoles = Consoles;
	}
	
	
	private String getconsoles() {
	    return Consoles;

	}
	
}
