package application;

import entities.Casa;

public class PraticandoOO {

	public static void main(String[] args) {
		
		Casa casa = new Casa();
		
		casa.porta1 = true;
		casa.porta2 = true;
		casa.porta3 = false;
		
	casa.pinta("Verde");
	
	System.out.println(casa.cor);
	System.out.printf("O número de portas abertas é: %d",casa.quantasPortasEstaoAbertas());
	
	

	}

}
