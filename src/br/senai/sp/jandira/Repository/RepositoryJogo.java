package br.senai.sp.jandira.Repository;

import br.senai.sp.jandira.jogo.Jogo;

public class RepositoryJogo {

	
	private Jogo[] games; 
	  
	private RepositoryJogo() {
		games = new Jogo[5];
		
	}
	
	private RepositoryJogo(int quantidadegames) {
		games = new Jogo[quantidadegames];

	}
	
	public void gravargames(Jogo jogos, int posicao) {
		games[posicao] = jogos;
	}
	

	
	
	
}
