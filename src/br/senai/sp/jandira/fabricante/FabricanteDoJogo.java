package br.senai.sp.jandira.fabricante;

import java.time.LocalDate;

public class FabricanteDoJogo {

	
	//private String local;
	//private String numero;
	//private String email;
	
 
	
	private String nome;
	private LocalDate dataFunda��o;
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDataFunda��o(LocalDate dataFunda��o) {
		this.dataFunda��o = dataFunda��o;
	}
	
	public LocalDate getDataFunda��o() {
		return dataFunda��o;
	}
	
	
}
