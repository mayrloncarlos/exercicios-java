package application;

import java.util.Scanner;

public class DescontoCarro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorDesconto, valorCarro;
		int anoCarro;
		char pergunta = 'S';
		
		
		System.out.println("Informe o valor do veículo: ");
		valorCarro = sc.nextDouble();
		System.out.println("Informe o ano do veículo: ");
		anoCarro = sc.nextInt();
		
		if (anoCarro <= 2000) {
			valorCarro -= (valorCarro * 0.12);
			System.out.println(valorCarro);
		}
		else {
			valorCarro -= (valorCarro * 0.7);
		}

	}

}
