package br.senai.sp.jandira.fabricante;

public class FabricanteDoJogo {

	private String nome[] = new String[6];
	//private String local;
	//private String numero;
	//private String email;
	
	public FabricanteDoJogo() {
		
		this.nome[0] = "Sony";
		this.nome[1] = "Nitendo";
		this.nome[2] = "Sega";
		this.nome[3] = "Xbox";
		this.nome[4] = "Activision";
		this.nome[5] = "Playsatiton";
	}
	

	public String[] getNome() {
		return this.nome;
	}
	
}
