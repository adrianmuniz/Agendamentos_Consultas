package br.com.consulta.beans;

public class Gerente extends Funcionario {

	private String deptResponsavel;
	
	public Gerente() {}

	public Gerente(String cpf, String nome, String fone, float salario, String dtadmissao, String dtdemissao,
			String departamento, String deptResponsavel) {
		super(cpf, nome, fone, salario, dtadmissao, dtdemissao, departamento);
		this.deptResponsavel = deptResponsavel;
	}

	public String getDeptResponsavel() {
		return deptResponsavel;
	}

	public void setDeptResponsavel(String deptResponsavel) {
		this.deptResponsavel = deptResponsavel;
	};
	
	
}
