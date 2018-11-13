package application;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 40;

		while (x > 1) {
			if (x % 2 == 0) {
				x = x / 2;
			} else if (x % 2 == 1) {
				x = 3 * x + 1;
			}
		}

		System.out.println("X é: " + x);

		sc.close();
	}

}
