package ConversorMoedas;

import javax.swing.JOptionPane;

public class ConversorMoedas {

	//Converter real para todas as moedas
	public void converterReaisADolar(double valor) {
		double moedaDolar = valor / 5.28;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + moedaDolar + " Dólares");
	}

	public void converterReaisAEuro(double valor) {
		double moedaEuro = valor / 5.69;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem €" + moedaEuro + " Euros");
	}

	public void converterReaisALibras(double valor) {
		double moedaLibras = valor / 6.43;
		moedaLibras = (double) Math.round(moedaLibras * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem £" + moedaLibras + " Libras Esterlinas");
	}

	public void converterReaisAPesoArgentino(double valor) {
		double moedaPesoArgentina = valor / 0.026;
		moedaPesoArgentina = (double) Math.round(moedaPesoArgentina * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + moedaPesoArgentina + " Pesos Argentinos");
	}
	
	public void converterReaisAPesoChileno(double valor) {
		double moedaPesoChile = valor / 0.0064;
		moedaPesoChile = (double) Math.round(moedaPesoChile * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + moedaPesoChile + " Pesos Chilenos");
	}
	
	// Converter todas as moedas para Real
	public void converterDolarAReal(double valor) {
		double moedaDolarReal = valor * 5.28;
		moedaDolarReal = (double) Math.round(moedaDolarReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$" + moedaDolarReal + " Reais");
	}
	
	public void converterEuroAReal(double valor) {
		double moedaEuroReal = valor * 5.69;
		moedaEuroReal = (double) Math.round(moedaEuroReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$" + moedaEuroReal + " Reais");
	}
	
	public void converterLibrasAReal(double valor) {
		double moedaLibrasReal = valor * 6.43;
		moedaLibrasReal = (double) Math.round(moedaLibrasReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$" + moedaLibrasReal + " Reais");
	}
	
	public void converterPesoArgentinoAReal(double valor) {
		double moedaPesoArgentinaReal = valor * 0.026;
		moedaPesoArgentinaReal = (double) Math.round(moedaPesoArgentinaReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$" + moedaPesoArgentinaReal + " Reais");
	}
	
	public void converterPesoChilenoAReal(double valor) {
		double moedaPesoChileReal = valor * 0.0064;
		moedaPesoChileReal = (double) Math.round(moedaPesoChileReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$" + moedaPesoChileReal + " Reais");
	}
}
