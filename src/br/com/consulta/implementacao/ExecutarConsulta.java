package br.com.consulta.implementacao;

import br.com.consulta.beans.Medico;
import br.com.consulta.beans.Pessoa;

public class ExecutarConsulta {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa ("123456", "Cainã", "9898987");
		
		Medico m = new Medico("CRM1234", "Pediatra");
		
		System.out.println(m.getEspecialidade());
		
	}
}
