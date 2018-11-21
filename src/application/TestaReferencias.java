package application;

import entities.Conta_caelum;

public class TestaReferencias {

	public static void main(String[] args) {

		/*ContaCaelum minhaConta = new ContaCaelum();

		minhaConta.titular = "Duke";
		minhaConta.saldo = 1000;
		
		minhaConta.saca(200);
		
		minhaConta.deposita(500);
		System.out.printf("%.2f", minhaConta.saldo);

		}*/
		
		Conta_caelum c1 = new Conta_caelum();
		
		c1.deposita(100);
		
		Conta_caelum c2 = c1;
		c2.deposita(200);
		
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);

	}
}
