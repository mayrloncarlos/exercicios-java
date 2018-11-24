package application;

import entities.Porta;

public class PraticandoOO {

	public static void main(String[] args) {
		
		Porta porta = new Porta();
		
		porta.abre();
		porta.fecha();
		porta.pinta("Azul");
		porta.aberta = false;
		
		System.out.println(porta.cor);
		porta.estaAberta();

	}

}
