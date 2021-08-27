package br.com.consulta.implementacao;

import br.com.consulta.beans.Funcionario;
import br.com.consulta.beans.Gerente;
import br.com.consulta.beans.Medico;
import br.com.consulta.beans.Paciente;

public class ExecutarConsulta {

	public static void main(String[] args) {
		
		
		Funcionario f = new Funcionario(1000, null, null, null);
		
		System.out.println("Funcionario: " + f.getNome() + " Dtadm: " + f.getDtadmissao() + " Salario:" + f.getSalario());
		
		Paciente pa = new Paciente("1234", "Antonio", "98987");
		
		System.out.println("Paciente: " + pa.getNome() + " cpf:" + pa.getCpf());
		
		Gerente g = new Gerente(1000, "19/11/2021", null, null, null);
		
		
		System.out.println(g.participacaoLucros());
		System.out.println(f.participacaoLucros());
		
	}
}
