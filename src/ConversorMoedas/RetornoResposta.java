package ConversorMoedas;

import javax.swing.JOptionPane;

public class RetornoResposta {

	public void retornarResposta(int resposta) {
		if (resposta == JOptionPane.OK_OPTION) {
			System.out.println("Escolha opção Afirmativa");
		}
		else {
			JOptionPane.showMessageDialog(null, "Progama finalizado");
			
		}
	}
}
