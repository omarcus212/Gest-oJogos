package br.senai.sp.jandira.fabricante;

public class FabricanteDoJogo {

	private String nome[];
	private String local;
	private String numero;
	private String email;
	

	public String getNome() {
		return nome[5];
		
	}

	public void setNome(String nome) {
		nome = this.nome[5] ;
		this.nome [0] = "brasil";
		this.nome [1] = "eu";
		this.nome [2] = "consegui";
		this.nome [3] = "man";
		
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
