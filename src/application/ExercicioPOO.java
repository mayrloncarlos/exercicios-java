package application;

import java.util.Scanner;

public class ExercicioPOO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[5];
		
		list[0] = 15;
		list[1] = 8;
		list[2] = 7;
		list[3] = 22;
		list[4] = 11;
		
		/*for(int i = 0; i<list.length;i++) {
			if (list[i] >= 10) {
				list[i] = list[i];
				System.out.println(list[i] + " É maior que 10");
			}
			
		}*/
		
		for(int valor: list) {
			if (valor >= 10) {
				System.out.println(valor + " É maior que 10");
			}
		}
	}
}

