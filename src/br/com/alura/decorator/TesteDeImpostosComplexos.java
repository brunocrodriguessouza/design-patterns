package br.com.alura.decorator;

public class TesteDeImpostosComplexos {
	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS(new ICPP()));
		
		Orcamento orcamento = new Orcamento(500);
		double valorImposto = iss.calcular(orcamento);
		
		System.out.println(valorImposto);
	}
}
