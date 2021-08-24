package br.com.consulta.implementacao;

import br.com.consulta.beans.Agendamento;
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
		
		Medico med = new Medico(input.texto("CRM:"), input.texto("Médico:"));
		
		System.out.println(med.apresentar());
		
		Agendamento agenda = new Agendamento(input.texto("Data:"), input.texto("Hora:"), pac, input.decimal("Valor:"), med);
		
		System.out.println(agenda.agendar());
		System.out.println(agenda.mostrar());
		
		
	}
	

}
