package br.senai.sp.jandira.jogo;

public enum QuantidadeZerado {
	
	zero("0"),
	um("1"), 
	dois("2"), 
	tres("3"),
	quatro("4"), 
	cinco("5");
	
	private String zerado;

	 private QuantidadeZerado(String Zerado) {
		this.zerado = Zerado;
			
	}
		

	public String getzerado() {
		return zerado;

	}

}
