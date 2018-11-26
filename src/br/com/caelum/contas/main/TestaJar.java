package br.com.caelum.contas.main;

public class TestaJar {

	public static void main(String[] args) {
		
		int[] list = new int[5];
		list [0] = 10;
		list [1] = 20;
		list [2] = 5;
		list [3] = 2;
		list [4] = 30;
		
		for(int i = 0; i < list.length; i++) {
			if (list[i] >= 10) {
				list[i] = list[i];
				System.out.println(list[i] + " é maior que 10");
			}
			
		}
		System.out.println();
		
		for(int valor: list) {
			if(valor >= 10 ) {
				System.out.println(valor + " é maior que 10");
			}
		}
	}

}
