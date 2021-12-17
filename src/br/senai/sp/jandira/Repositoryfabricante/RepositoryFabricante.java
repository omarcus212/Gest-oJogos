package br.senai.sp.jandira.Repositoryfabricante;

import java.time.LocalDate;
import java.util.Arrays;

import br.senai.sp.jandira.fabricante.FabricanteDoJogo;


public class RepositoryFabricante {

	 
	
	
	private FabricanteDoJogo[] fabricante;
	
	FabricanteDoJogo f = new FabricanteDoJogo();
	
	
	
	
	
	  public RepositoryFabricante() {
			fabricante = new FabricanteDoJogo[3];
			
			FabricanteDoJogo Tencent = new FabricanteDoJogo();
			Tencent.setNome("Sony");
			Tencent.setDataFundação(LocalDate.of(1946, 5, 7));
			fabricante[0] =  Tencent;
			
			FabricanteDoJogo Apple = new FabricanteDoJogo();
			Apple.setNome("Actionvisa");
			Apple.setDataFundação(LocalDate.of(1979, 10, 1));
			fabricante[1] = Apple;
			
			FabricanteDoJogo Microsoft = new FabricanteDoJogo();
			Microsoft.setNome("Gamera");
			Microsoft.setDataFundação(LocalDate.of(1889, 9, 23));
			fabricante[2] = Microsoft;
			
			
		}
		
		public FabricanteDoJogo[] getFabricantes() {
			
			return fabricante;
		}
		public void FabricanteRepository(int quantidadedefabricantes) {
			
			fabricante = new FabricanteDoJogo[quantidadedefabricantes];
		}
		public void gravar(FabricanteDoJogo fabricantes, int posicao) {
			fabricante[posicao] = fabricantes;
		
		}
		public FabricanteDoJogo listarFabricantes(int posiçao) {
			return fabricante [posiçao];
		}
		public FabricanteDoJogo[] listartodos() {
			return fabricante;
		}
		public int getTamanhoTotal() {
			return fabricante.length;
		}
		public int getIndex(FabricanteDoJogo fabricante) {
			int getIndex = Arrays.asList(this.fabricante).indexOf(fabricante);
			return getIndex;
		}
		

	
	
}
