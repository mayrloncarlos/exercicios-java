package application;

import entities.Conta_caelum;
import entities.Data_caelum;

public class ExercicioPOO {

	public static void main(String[] args) {
		
	
		Conta_caelum c1 = new Conta_caelum();
		
		c1.deposita(-1000);

		
		System.out.println(c1.getSaldo());
		
		
	}		
}
