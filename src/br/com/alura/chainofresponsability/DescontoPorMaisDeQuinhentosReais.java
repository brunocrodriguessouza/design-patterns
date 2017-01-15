package br.com.alura.chainofresponsability;

public class DescontoPorMaisDeQuinhentosReais implements Desconto{

	private Desconto proximo;

	public double calcularDesconto(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else {
			return proximo.calcularDesconto(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}
}
