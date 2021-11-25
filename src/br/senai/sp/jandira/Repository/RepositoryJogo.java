package br.senai.sp.jandira.Repository;

import br.senai.sp.jandira.jogo.Jogo;


    public class RepositoryJogo {

	
	private Jogo[] games; 
	private String jogo;
	  
	public RepositoryJogo() {
		games = new Jogo[100];
	}
	
	
	
	
	private RepositoryJogo(int quantidadegames) {
		games = new Jogo[quantidadegames];

	}
	
	
	
	public void gravargames(Jogo jogos, int posicao) {
		games[posicao] = jogos;
	}
	
	public int gettamanho() {
		return games.length; 
	}

	public Jogo jogoslist(int posiçao){
		return games[posiçao];
		
	}
	
	
	
}
