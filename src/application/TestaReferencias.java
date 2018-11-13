package application;

import entities.ContaCaelum;

public class TestaReferencias {

	public static void main(String[] args) {

		/*ContaCaelum minhaConta = new ContaCaelum();

		minhaConta.titular = "Duke";
		minhaConta.saldo = 1000;
		
		minhaConta.saca(200);
		
		minhaConta.deposita(500);
		System.out.printf("%.2f", minhaConta.saldo);

		}*/
		
		ContaCaelum c1 = new ContaCaelum();
		
		c1.deposita(100);
		
		ContaCaelum c2 = c1;
		c2.deposita(200);
		
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);

	}
}
