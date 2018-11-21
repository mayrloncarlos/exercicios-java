package application;

import entities.Conta_caelum;
import entities.Data_caelum;

public class ExercicioPOO {

	public static void main(String[] args) {
		
	
		Conta_caelum c1 = new Conta_caelum();
		c1.titular = "Danilo";
		c1.saldo = 100;
		Data_caelum data = new Data_caelum();
		data.dia = 19;
		data.mes = 11;
		data.ano = 1992;
		c1.dataAbertura = data;
		
		System.out.println(c1.recuperaDadosParaImpressao());
		
		
	}		
}
