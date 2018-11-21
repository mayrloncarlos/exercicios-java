package entities;

public class Conta_caelum {
	public int numero;
	public String titular;
	public String agencia;
	public double saldo;
	public Data_caelum dataAbertura;


	//==========Método saca padrão============
	 public void saca(double quantidade) { 
	 double novoSaldo = this.saldo - quantidade;               
	 this.saldo = novoSaldo; 
	  }

	//==========Método que deposita uma quantidade na conta==============
	public void deposita(double quantidade) {                
		this.saldo += quantidade;
	}
	
	//==========Método que calcula o rendimento da conta==============
	public void calculaRendimento() {
		double rendimento = this.saldo * 0.1;
		this.saldo = rendimento;
	}
	
	//==========Método que mostra na tela todos os dados da conta==============
	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nData de Abertura: " + this.dataAbertura;
		return dados;
	}

/*	
	public boolean saca(double valor) {                       // Médoto saca que retorna boolean
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
*/	

/*
	public void transfere(ContaCaelum destino, double valor) {          //Método que transfere padrão
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
*/
	
/*	
	public boolean transferePara(Conta_caelum destino, double valor) {     //Método que transfere com validação
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			System.out.println("Você não tem saldo suficiente!");
			return false;
		}
		else {
			destino.deposita(valor);
			System.out.println("Depósito efetuado com sucesso!");
			return true;
		}
	}
*/	

}