package entities;

public class Carro_caelum {

	public String cor;
	public String modelo;
	public double velocidadeAtual;
	public double velocidadeMaxima;
	public Motor_caelum motor;
	
	
	public void liga() {
		System.out.println("O carro est� ligado");
	}
	
	public void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	public int pegaMarcha() {
		if (this.velocidadeAtual < 0) {
			return -1;
		}
		
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
		}
		
		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}
}
