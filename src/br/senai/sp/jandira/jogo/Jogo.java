package br.senai.sp.jandira.jogo;

import br.senai.sp.jandira.fabricante.*;

public class Jogo {

	private String titulo;
	private FabricanteDoJogo fabrincante;
	private Zerado zerado;
	private Consoles console;
	private String valor;
	private String observacao;
	private QuantidadeZerado quantidade;

	public QuantidadeZerado getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(QuantidadeZerado quantidade) {
		this.quantidade = quantidade;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public FabricanteDoJogo getFabrincante() {
		return fabrincante;
	}

	public void setFabrincante(FabricanteDoJogo fabrincante) {
		this.fabrincante = fabrincante;
	}

	public Zerado getZerado() {
		return zerado;
	}

	public void setZerado(Zerado zerado) {
		this.zerado = zerado;
	}

	public Consoles getConsole() {
		return console;
	}

	public void setConsole(Consoles console) {
		this.console = console;
	}

	public void setValor(String valor) {
		this.valor = valor;
		
	}
	
	public String getValor() {
		return valor;
	}

	

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
