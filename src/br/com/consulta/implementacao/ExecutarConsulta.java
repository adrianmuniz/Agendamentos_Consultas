package br.com.consulta.implementacao;

import br.com.consulta.beans.Funcionario;
import br.com.consulta.beans.Medico;
import br.com.consulta.beans.Pessoa;

public class ExecutarConsulta {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa ("123456", "Cainã", "9898987");
		
		Medico m = new Medico("CRM1234", "Pediatra", "22321", "Cainã", "9898897");
		
		System.out.println("Medico: " + m.getNome());
		
		Funcionario f = new Funcionario("12231", "Cainã", "998977", 5000f, "10/08/2019", null);
		
		System.out.println("Funcionario: " + f.getNome() + " Dtadm: " + f.getDtadmissao() + " Salario:" + f.getSalario());
	}
}
