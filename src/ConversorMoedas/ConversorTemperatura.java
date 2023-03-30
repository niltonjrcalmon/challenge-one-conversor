package ConversorMoedas;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public void converterCParaF(double valor) {
		double tempCParaF = (1.8 * valor) + 32;
		tempCParaF = (double) Math.round(tempCParaF * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A conversão de Celsius para Farenheit é: " +tempCParaF+"F");
	}
	
	public void converterCParaK(double valor) {
		double tempCParaK = valor + 273;
		tempCParaK = (double) Math.round(tempCParaK * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A conversão de Celsius para Kelvin é: "+tempCParaK+ "K");
	}
	
	public void converterFParaC(double valor) {
		double tempFParaC = (valor - 32) / 1.8;
		tempFParaC = (double) Math.round(tempFParaC * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A conversão de Farenheit para Celsius é: "+tempFParaC+"°C");
	}
	
	public void converterFParaK(double valor) {
		double tempFParaK = (valor-32) * 5/9 + 273;
		tempFParaK = (double) Math.round(tempFParaK * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A conversão de Farenheit para Kelvin é: "+tempFParaK+"K");
	}
	
	public void converterKParaC(double valor) {
		double convertKParaC = 273 - valor;
		double tempKParaC = - convertKParaC;
		tempKParaC = (double) Math.round(tempKParaC * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A conversão de Kelvin para Celsius é: "+tempKParaC+"°C");
	}
	
	public void converterKParaF(double valor) {
		double tempKParaF = (valor-273) * (1.8) + 32;
		tempKParaF = (double) Math.round(tempKParaF * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A conversão de Kelvin para Farenheit é: "+tempKParaF+"F");
	}
}
