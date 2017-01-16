package br.com.alura.decorator;

public abstract class TemplateDeImpostoCondicional extends Imposto{
	
	@Override
	public double calcular(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}else{
			return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
