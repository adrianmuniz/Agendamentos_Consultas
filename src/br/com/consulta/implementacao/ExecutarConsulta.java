package br.com.consulta.implementacao;

import br.com.consulta.beans.Agendamento;
import br.com.consulta.beans.Medico;
import br.com.consulta.beans.Paciente;
import br.com.consulta.util.input;

public class ExecutarConsulta {

	public static void main(String[] args) {
		
		String opcao;
		Paciente pac = new Paciente();

		pac.setNome(input.texto("Paciente:"));
		pac.setCpf(input.texto("CPF:"));
		pac.setFone(input.texto("Telefone:"));
		
		System.out.println(pac.apresentar());
		
		Medico med1 = new Medico(input.texto("CRM:"), input.texto("Médico:"));
		Medico med2 = new Medico(input.texto("CRM:"), input.texto("Médico:"));
		
		System.out.println(med1.apresentar());
		System.out.println(med2.apresentar());
		
		//Escolhendo médico
		
		opcao = input.texto("Escolha o médico: 1 = " + med1.getNome() + " - 2 =" + med2.getNome());
		
		Agendamento agenda = new Agendamento(input.texto("Data:"), input.texto("Hora:"), pac, input.decimal("Valor:"), med1);
		
		System.out.println(agenda.agendar());
		System.out.println(agenda.mostrar());
		
	}
}
