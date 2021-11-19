package br.senai.sp.jandira.Repositoryfabricante;

import br.senai.sp.jandira.fabricante.FabricanteDoJogo;


public class RepositoryFabricante {

	 
	
	
	private FabricanteDoJogo[] fabricante;
	
	FabricanteDoJogo f = new FabricanteDoJogo();
	
	
	
	
	  public RepositoryFabricante() {
	      fabricante = new FabricanteDoJogo[5];
		 
	}
		
	  
	  
	  public void gravar(FabricanteDoJogo fabricante, int posicao) {
			this.fabricante[posicao] = fabricante;
		
		}
	
	
	
}
