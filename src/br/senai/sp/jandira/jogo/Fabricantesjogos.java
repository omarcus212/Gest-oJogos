package br.senai.sp.jandira.jogo;

public enum Fabricantesjogos {

	UBISOFT("Ubsoft"),
	ROCKSTARGAMES("ROCKSTAR"),
	MICROSOFT("MICROSOFT"),
	EASports("EA Sports"),
	XBOX("Xbox"),
	PLAYSTATION("Playstation"),
	WarnerBros("Warner Bros"),
	GARENA("GARENA"),
	ActivisionA("Activision"),
	outro("Other");
	
	   private String Frabica;
	
	private Fabricantesjogos(String Fabricante) {
	 
		this.Frabica = Fabricante;
	}
	
	public String getFrabica() {
		return Frabica;
	}
	
}
