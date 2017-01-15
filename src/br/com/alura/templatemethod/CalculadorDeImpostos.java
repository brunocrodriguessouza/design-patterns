package br.com.alura.templatemethod;

public class CalculadorDeImpostos {

	public void realizarCalculo(Orcamento orcamento, Imposto imposto) {

		double calculoImposto = imposto.calcular(orcamento);
		System.out.println(calculoImposto);
	}

}
