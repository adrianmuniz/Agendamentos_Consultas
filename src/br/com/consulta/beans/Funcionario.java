package br.com.consulta.beans;

public class Funcionario extends Pessoa {
	
	private float salario;
	private String dtadmissao;
	private String dtdemissao;
	private String departamento;

	
	public Funcionario() {}


	public Funcionario(String cpf, String nome, String fone, float salario, String dtadmissao, String dtdemissao,
			String departamento) {
		super(cpf, nome, fone);
		this.salario = salario;
		this.dtadmissao = dtadmissao;
		this.dtdemissao = dtdemissao;
		this.departamento = departamento;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	public String getDtadmissao() {
		return dtadmissao;
	}


	public void setDtadmissao(String dtadmissao) {
		this.dtadmissao = dtadmissao;
	}


	public String getDtdemissao() {
		return dtdemissao;
	}


	public void setDtdemissao(String dtdemissao) {
		this.dtdemissao = dtdemissao;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	};

	
}
