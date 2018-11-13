package entities;

public class ContaCaelum {
	public int numero;
	public String titular;
	public double saldo;

	public void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;

	}

	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}

}
