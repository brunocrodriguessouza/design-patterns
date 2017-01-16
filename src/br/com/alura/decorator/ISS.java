package br.com.alura.decorator;

public class ISS extends Imposto {
	 
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ISS() {
	}

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}
}
