package br.com.consulta.beans;

public class Gerente extends Funcionario {

	private String deptResponsavel;
	
	public Gerente() {}

	
	public Gerente(float salario, String dtadmissao, String dtdemissao, String departamento, String deptResponsavel) {
		super(salario, dtadmissao, dtdemissao, departamento);
		this.deptResponsavel = deptResponsavel;
	}

	public String getDeptResponsavel() {
		return deptResponsavel;
	}

	public void setDeptResponsavel(String deptResponsavel) {
		this.deptResponsavel = deptResponsavel;
	};
	
	@Override
	public double participacaoLucros() {
		return super.getSalario() * 0.5;
	}
}
