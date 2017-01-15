package br.com.alura.chainofresponsability;

public interface Desconto {

	double calcularDesconto(Orcamento orcamento);

	void setProximo(Desconto proximo);
}
