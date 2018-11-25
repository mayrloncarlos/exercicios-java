package application;

import entities.Conta_caelum;
import entities.Data_caelum;

public class ExercicioPOO {

	public static void main(String[] args) {
		
	String titular = "Carlos";
	Conta_caelum c1 = new Conta_caelum(titular);
		
	System.out.println(c1.getTitular());
	}		
}
