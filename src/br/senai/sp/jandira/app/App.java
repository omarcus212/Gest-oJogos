package br.senai.sp.jandira.app;

import java.util.Iterator;

import br.senai.sp.jandira.fabricante.FabricanteDoJogo;
import br.senai.sp.jandira.frame.Framejogo;
import br.senai.sp.jandira.jogo.Jogo;

public class App {

	public static void main(String[] args) {
				
		Framejogo frame = new Framejogo();
		frame.setVisible(true);
		

		FabricanteDoJogo fb = new FabricanteDoJogo();
		
		String nome[] = fb.getNome();
		

	for (int i = 0; i < nome.length; i++) {
		System.out.println(nome[i]);
		
	}


	} 

	
}
