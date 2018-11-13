package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Insira o número da conta: ");
		int number = sc.nextInt();
		System.out.print("Informe seu nome: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Você pretende fazer um depósito inicial? (s/n)? ");
		char response = sc.next().charAt(0);
		if (response == 's') {
			System.out.print("Insira o valor do depósito inicial: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(number, holder, initialDeposit);
		}
		else {
			conta = new Conta(number, holder);
		}
		
		System.out.println();
		System.out.println("Saldo da conta: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Você gostaria de fazer um depósito? (s/n)? ");
		response = sc.next().charAt(0);
		if (response == 's') {
			System.out.println();
			System.out.print("Entre com o valor do depósito: ");
			double depositValue = sc.nextDouble();
			conta.deposit(depositValue);
			System.out.println();
			System.out.println("Saldo da conta:");
			System.out.println(conta);
			System.out.println();
		}
		else {
			System.out.println();
			System.out.println("Saldo da conta: ");
			System.out.println(conta);
			System.out.println();
		}
		
		System.out.print("Gostaria de fazer saque? (s/n)? ");
		response = sc.next().charAt(0);
		if (response == 's') {
			System.out.println();
			System.out.print("Entre com o valor do saque: ");
			double withdrawValue = sc.nextDouble();
			conta.withdraw(withdrawValue);
			System.out.println();
			System.out.println("Saldo da conta:");
			System.out.println(conta);
			System.out.println();
		}
		else {
			System.out.println();
			System.out.println("Saldo da conta: ");
			System.out.println(conta);
			System.out.println();
		}
		
		
		
		sc.close();
	}

}
