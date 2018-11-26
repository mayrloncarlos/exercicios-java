package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
		System.out.println("Acesso Permitido!");
		return true;
		} else {
		System.out.println("Acesso Negado!");
		return false;
		}
		}
	
	public Gerente() {
		
	}

	public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
}
