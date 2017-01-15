package br.com.alura.templatemethod;

public class ICMS implements Imposto {

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
