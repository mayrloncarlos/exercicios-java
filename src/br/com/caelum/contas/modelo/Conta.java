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


	//==========Método saca padrão============
	 public void saca(double quantidade) { 
	 double novoSaldo = this.saldo - quantidade;               
	 this.saldo = novoSaldo; 
	  }

	//==========Método que deposita uma quantidade na conta==============
	public void deposita(double quantidade) {  
		if (quantidade <= 0) {
			System.out.println("Você não pode depositar esse valor!");
		}
		else {
		this.saldo += quantidade;
		}
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
	

/*	============Médoto saca que retorna boolean==========
	public boolean saca(double valor) {                       
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
*/	

/* =============Método que transfere padrão==========
	public void transfere(ContaCaelum destino, double valor) {          
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
*/
	
/*	===========Método que transfere com validação==========
	public boolean transferePara(Conta_caelum destino, double valor) {     
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