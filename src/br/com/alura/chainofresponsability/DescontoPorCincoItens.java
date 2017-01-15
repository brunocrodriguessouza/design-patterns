package br.com.alura.chainofresponsability;

public class DescontoPorCincoItens implements Desconto{

	private Desconto proximo;

	public double calcularDesconto(Orcamento orcamento){
		if(orcamento.getItens().size() > 5){
			 return orcamento.getValor() * 0.1;
		}else{
			return proximo.calcularDesconto(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}
}
