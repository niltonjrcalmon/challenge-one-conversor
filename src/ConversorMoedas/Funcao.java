package ConversorMoedas;

import javax.swing.JOptionPane;

public class Funcao {

	ConversorMoedas moedas = new ConversorMoedas();
	ConversorTemperatura temperatura = new ConversorTemperatura();

	public void converterMoedas(double valorRecebido) {
		String alternativas[] = { "De Reais a Dolares", "De Reais a Euros", "De Reais a Libras",
				"De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dolares a Reais", "De Euros a Reais",
				"De Libras a Reais", "De Peso Argentino a Reais", "De Peso Chileno a Reais" };
		String opcoes = (String) JOptionPane
				.showInputDialog(null, "Escolha a moeda para qual você deseja girar seu dinheiro", "Moedas",
						JOptionPane.PLAIN_MESSAGE, null, alternativas, "De Reais a Dolares")
				.toString();

		switch (opcoes) {
		case "De Reais a Dolares":
			moedas.converterReaisADolar(valorRecebido);
			break;
		case "De Reais a Euros":
			moedas.converterReaisAEuro(valorRecebido);
			break;
		case "De Reais a Libras":
			moedas.converterReaisALibras(valorRecebido);
			break;
		case "De Reais a Peso Argentino":
			moedas.converterReaisAPesoArgentino(valorRecebido);
			break;
		case "De Reais a Peso Chileno":
			moedas.converterReaisAPesoChileno(valorRecebido);
			break;
		case "De Dolares a Reais":
			moedas.converterDolarAReal(valorRecebido);
			break;
		case "De Euros a Reais":
			moedas.converterEuroAReal(valorRecebido);
			break;
		case "De Libras a Reais":
			moedas.converterLibrasAReal(valorRecebido);
			break;
		case "De Peso Argentino a Reais":
			moedas.converterPesoArgentinoAReal(valorRecebido);
			break;
		case "De Peso Chileno a Reais":
			moedas.converterPesoChilenoAReal(valorRecebido);
			break;
		}
	}

	public void converterTemperatura(double valorTemperatura) {
		String alternativas[] = { "De Celsius para Farenheit", "De Celsius para Kelvin", "De Farenheit para Celsius",
				"De Farenheit para Kelvin", "De Kelvin para Celsius", "De Kelvin para Farenheit" };
		String opcoes = (String) JOptionPane
				.showInputDialog(null, "Escolha a temperatura que você quer converter", "Temperaturas",
						JOptionPane.PLAIN_MESSAGE, null, alternativas, "De Celsius para Farenheit")
				.toString();
		switch (opcoes) {
		case "De Celsius para Farenheit":
			temperatura.converterCParaF(valorTemperatura);
			break;
		case "De Celsius para Kelvin":
			temperatura.converterCParaK(valorTemperatura);
			break;
		case "De Farenheit para Celsius":
			temperatura.converterFParaC(valorTemperatura);
			break;
		case "De Farenheit para Kelvin":
			temperatura.converterFParaK(valorTemperatura);
			break;
		case "De Kelvin para Celsius":
			temperatura.converterKParaC(valorTemperatura);
			break;
		case "De Kelvin para Farenheit":
			temperatura.converterKParaF(valorTemperatura);
			break;
		}

	}
}