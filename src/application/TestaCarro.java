package application;

import entities.Carro_caelum;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro_caelum meuCarro = new Carro_caelum();
		
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.liga();
		
		meuCarro.acelera(20);
		
		System.out.println(meuCarro.velocidadeAtual);

	}

}
