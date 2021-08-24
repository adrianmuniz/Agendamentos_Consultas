package br.com.consulta.implementacao;

import br.com.consulta.beans.Paciente;
import br.com.consulta.util.input;

public class ExecutarConsulta {

	public static void main(String[] args) {
		
		Paciente pac = new Paciente();

		pac.setNome(input.texto("Nome:"));
		pac.setCpf(input.texto("CPF:"));
		pac.setFone(input.texto("Telefone:"));
		
		System.out.println(pac.apresentar());
		
		
	}

}
