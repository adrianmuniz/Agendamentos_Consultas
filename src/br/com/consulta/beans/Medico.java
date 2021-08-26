package br.com.consulta.beans;

public class Medico extends Pessoa {
	private String crm;
	private String especialidade;
	
	public Medico() {};
	
	public Medico(String crm, String especialidade, String cpf, String nome, String fone) {
		super(cpf, nome, fone);
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
	}

}
