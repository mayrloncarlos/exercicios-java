package br.com.caelum.contas.modelo;

public class Conta {
	public int numero;
	private String titular;
	public String agencia;
	private double saldo;
	public Data dataAbertura;
	private double limite;
	private static int totalDeContas;

	
    // ==============================CONSTRUCTORS=========================================
	
	/*public Conta_caelum() {
		Conta_caelum.totalDeContas += 1;
	}*/
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	
	public Conta(String titular) {
		this.titular = titular;
	}
	
	public Conta() {
		
	}

	// ==============================GETTERS AND SETTERS==================================	
	
		public double getSaldo() {
			return this.saldo;
		}
		
		public String getTitular() {
			return this.titular + this.limite;
		}
		
		public void setTitular(String titular) {
			this.titular = titular;
		}
		
		public void getRendimento() {
			double rendimento = this.saldo * 0.1;
			this.saldo = rendimento;
		}


	//==========M�todo saca padr�o============
	 public void saca(double quantidade) { 
	 double novoSaldo = this.saldo - quantidade;               
	 this.saldo = novoSaldo; 
	  }

	//==========M�todo que deposita uma quantidade na conta==============
	public void deposita(double quantidade) {  
		if (quantidade <= 0) {
			System.out.println("Voc� n�o pode depositar esse valor!");
		}
		else {
		this.saldo += quantidade;
		}
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
	

/*	============M�doto saca que retorna boolean==========
	public boolean saca(double valor) {                       
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
*/	

/* =============M�todo que transfere padr�o==========
	public void transfere(ContaCaelum destino, double valor) {          
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
*/
	
/*	===========M�todo que transfere com valida��o==========
	public boolean transferePara(Conta_caelum destino, double valor) {     
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