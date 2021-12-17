package br.senai.sp.jandira.fabricante;

import java.time.LocalDate;

public class FabricanteDoJogo {

	
	//private String local;
	//private String numero;
	//private String email;
	
 
	
	private String nome;
	private LocalDate dataFundação;
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDataFundação(LocalDate dataFundação) {
		this.dataFundação = dataFundação;
	}
	
	public LocalDate getDataFundação() {
		return dataFundação;
	}
	
	
}
