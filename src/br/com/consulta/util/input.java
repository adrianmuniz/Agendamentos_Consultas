package br.com.consulta.util;

import javax.swing.JOptionPane;

public class input {

	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	public static float decimal (String msg) {
		return Float.parseFloat(texto(msg));
	}
	
	public static float inteiro (String msg) {
		return Integer.parseInt(texto(msg));
	}
}

