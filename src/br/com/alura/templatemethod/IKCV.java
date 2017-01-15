package br.com.alura.templatemethod;

public class IKCV extends TemplateDeImpostoCondicional{

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        // Ordenando os valores descrecente para melhorar a performance
		orcamento.getItens().sort((s1, s2) -> Double.compare(s2.getValor(), s1.getValor()));
		
		for (Item item : orcamento.getItens()) {
			System.out.println(item.getValor());
			if (item.getValor() > 100)
				return true;
		}
		return false;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}
}
