package br.com.alura.decorator;

public class ICMS extends Imposto {

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICMS() {
	}

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
	}
}
