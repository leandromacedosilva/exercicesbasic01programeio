package com.exercicesbasic01programeio.util;

public class Client {
	private String nome;
	private String cpf;
	private String telefone;
	private String sexo;
	private int anoNascimento;
	private int anoAtual;
	
	public Client() {}

	public Client(String nome, String cpf, String telefone, String sexo, int anoNascimento, int anoAtual) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.sexo = sexo;
		this.anoNascimento = anoNascimento;
		this.anoAtual = anoAtual;
	}
	
	public void clientPrinter() {
		if((this.anoAtual - this.anoNascimento) > 17) {
		//System.out.println("INFORMACOES DO CLIENTE");
		System.out.println(this.nome + ", VOCE E DE MAIOR");
		System.out.println("CPF: " + this.cpf);
		System.out.println("TELEFONE: " + this.telefone);
		System.out.println("SEXO: " + this.sexo);
		System.out.println("ANO DE NASCIMENTO: " + this.anoNascimento);
		System.out.println("ANO CORRENTE: " + this.anoAtual);
		System.out.println("IDADE: " + (this.anoAtual - this.anoNascimento) + " ANOS + -");
		} else {
			//System.out.println("INFORMACOES DO CLIENTE");
			System.out.println(this.nome + ", VOCE E DE MENOR");
			System.out.println("CPF: " + this.cpf);
			System.out.println("TELEFONE: " + this.telefone);
			System.out.println("SEXO: " + this.sexo);
			System.out.println("ANO DE NASCIMENTO: " + this.anoNascimento);
			System.out.println("ANO CORRENTE: " + this.anoAtual);
			System.out.println("IDADE: " + (this.anoAtual - this.anoNascimento) + " ANOS + -");
		}
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int getAnoAtual() {
		return anoAtual;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

	@Override
	public String toString() {
		return "Client [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", sexo=" + sexo
				+ ", anoNascimento=" + anoNascimento + ", anoAtual=" + anoAtual + "]";
	}
	
	

}
