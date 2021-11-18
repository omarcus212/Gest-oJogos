package br.senai.sp.jandira.jogo;

import br.senai.sp.jandira.fabricante.*;

public class Jogo {

	private String titulo;
	private FabricanteDoJogo fabrincante;
	private Zerado zerado;
	private String console;
	private String valor;
	private String observacao;

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

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
