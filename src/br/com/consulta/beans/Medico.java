package br.com.consulta.beans;

public class Medico extends Funcionario {
	private String crm;
	private String especialidade;
	
	public Medico() {}

	public Medico(float salario, String dtadmissao, String dtdemissao, String departamento, String crm,
			String especialidade) {
		super(salario, dtadmissao, dtdemissao, departamento);
		this.crm = crm;
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	};
	
	@Override
	public double participacaoLucros() {
		return super.getSalario() * 0.6;
	}
	
}
