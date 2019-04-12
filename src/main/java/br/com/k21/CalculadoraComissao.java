package br.com.k21;

public class CalculadoraComissao {

	private static final int PERCENTUAL_FAIXA_SUPERIOR = 6;
	private static final int PERCENTUAL_FAIXA_INFERIOR = 5; 

	public static int calcular(int venda) {
		if (venda <= 10000) {
			return (venda * PERCENTUAL_FAIXA_INFERIOR / 100);
		} else {
			return (venda * PERCENTUAL_FAIXA_SUPERIOR / 100);
		}
	}

	public static double calcular(double venda) {
		if (venda <= 10000) {
			return Math.floor(100 * (venda * PERCENTUAL_FAIXA_INFERIOR / 100)) / 100;
		} else {
			return (venda * PERCENTUAL_FAIXA_SUPERIOR / 100.00);
		}
	}
}