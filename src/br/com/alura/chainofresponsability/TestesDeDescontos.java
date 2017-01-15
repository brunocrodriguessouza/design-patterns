package br.com.alura.chainofresponsability;

public class TestesDeDescontos {
	public static void main(String[] args) {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionarItem(new Item("Caneta",300));
		orcamento.adicionarItem(new Item("Lapis",300));
		
		double descontoFinal = descontos.calcular(orcamento);
		
		System.out.println(descontoFinal);
		
	}
}
