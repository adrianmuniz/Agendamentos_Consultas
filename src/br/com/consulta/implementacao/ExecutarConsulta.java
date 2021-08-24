package br.com.consulta.implementacao;

import br.com.consulta.beans.Medico;
import br.com.consulta.beans.Paciente;
import br.com.consulta.util.input;

public class ExecutarConsulta {

	public static void main(String[] args) {
		
		Paciente pac = new Paciente();

		pac.setNome(input.texto("Paciente:"));
		pac.setCpf(input.texto("CPF:"));
		pac.setFone(input.texto("Telefone:"));
		
		System.out.println(pac.apresentar());
		
		Medico med = new Medico(input.texto("CRM:"), input.texto("M�dico:"));
		
		System.out.println(med.apresentar());
	}

}
