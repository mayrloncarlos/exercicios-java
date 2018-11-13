package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Quartos[] vect = new Quartos[10];

		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			System.out.println();
			System.out.println("Quarto #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			sc.nextLine();
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Quartos(nome, email);
		}

		System.out.println();
		System.out.println("Quartos Ocupados:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();
	}

}
