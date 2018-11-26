package br.com.caelum.contas.modelo;

public class Cliente {
	private String nome;
	private String endereco;
	private String cpf;
	private int idade;
	
	public void mudaCPF(String cpf) {
		if (idade <= 60) {
		validaCPF(cpf);
		}
		this.cpf = cpf;
	}
	
	private void validaCPF(String cpf) {
		
	}
}
