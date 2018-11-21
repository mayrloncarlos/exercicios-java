package entities;

public class Conta_caelum {
	public int numero;
	public String titular;
	public String agencia;
	public double saldo;
	public Data_caelum dataAbertura;


	//==========M�todo saca padr�o============
	 public void saca(double quantidade) { 
	 double novoSaldo = this.saldo - quantidade;               
	 this.saldo = novoSaldo; 
	  }

	//==========M�todo que deposita uma quantidade na conta==============
	public void deposita(double quantidade) {                
		this.saldo += quantidade;
	}
	
	//==========M�todo que calcula o rendimento da conta==============
	public void calculaRendimento() {
		double rendimento = this.saldo * 0.1;
		this.saldo = rendimento;
	}
	
	//==========M�todo que mostra na tela todos os dados da conta==============
	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nN�mero: " + this.numero;
		dados += "\nAg�ncia: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nData de Abertura: " + this.dataAbertura;
		return dados;
	}

/*	
	public boolean saca(double valor) {                       // M�doto saca que retorna boolean
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
*/	

/*
	public void transfere(ContaCaelum destino, double valor) {          //M�todo que transfere padr�o
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
*/
	
/*	
	public boolean transferePara(Conta_caelum destino, double valor) {     //M�todo que transfere com valida��o
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			System.out.println("Voc� n�o tem saldo suficiente!");
			return false;
		}
		else {
			destino.deposita(valor);
			System.out.println("Dep�sito efetuado com sucesso!");
			return true;
		}
	}
*/	

}