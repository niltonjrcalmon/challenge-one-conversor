package ConversorMoedas;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JOptionPane;

public class Principal {

	private JFrame frame;

	public static void main(String[] args) {
		int resposta = 0;
		do {
			String possibilidades[] = { "Conversor de moeda", "Conversor de temperatura" };
			String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção: ", "Menu",
					JOptionPane.PLAIN_MESSAGE,null, possibilidades, "Conversor de moeda").toString();

			Funcao funcaoMoeda = new Funcao();
			Funcao funcaoTemp = new Funcao();
			RetornoResposta resp = new RetornoResposta();

			switch (opcoes) {
			case "Conversor de moeda":
				String entrada = JOptionPane.showInputDialog(null, "Insira um valor: ");
				if (entrada.matches("^[A-Za-z]*")) {
					resposta = JOptionPane.showConfirmDialog(null,
							"Por favor, coloque somente números!" + " Deseja Continuar?");
					resp.retornarResposta(resposta);
					break;
				}
				double valorRecebido = Double.parseDouble(entrada);
				funcaoMoeda.converterMoedas(valorRecebido);
				resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar? ");
				resp.retornarResposta(resposta);
				break;
				
			case "Conversor de temperatura":
				String temperatura = JOptionPane.showInputDialog(null, "Insira um valor: ");
				if (temperatura.matches("^[A-Za-z]*")) {
					resposta = JOptionPane.showConfirmDialog(null, "Por favor, coloque somente"
							+ "números! Deseja Continuar?");
					resp.retornarResposta(resposta);
					break;
				}
				double valorTemperatura = Double.parseDouble(temperatura);
				funcaoTemp.converterTemperatura(valorTemperatura);
				resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar? ");
				resp.retornarResposta(resposta);
				break;
			}
		} while (resposta == 0);
	}
}
