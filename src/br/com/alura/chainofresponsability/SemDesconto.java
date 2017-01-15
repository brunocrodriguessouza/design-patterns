package br.com.alura.chainofresponsability;

public class SemDesconto implements Desconto {

	@Override
	public double calcularDesconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		// nao tem proximo
	}

}
