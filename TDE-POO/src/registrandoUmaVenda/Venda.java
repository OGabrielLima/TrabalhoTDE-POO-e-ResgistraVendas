package registrandoUmaVenda;

public class Venda extends Produto {
	private float desconto;
	private int qtddItens;
	private float valor;
	private Produto produto;
	private Vendedor vendedor;
	
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public int getQtddItens() {
		return qtddItens;
	}
	public void setQtddItens(int qtddItens) {
		this.qtddItens = qtddItens;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public float efetuarDesconto(float desconto) {
		float valDesconto = produto.getValorVenda() * (desconto/100);
		
		float valorProd = produto.getValorVenda() - valDesconto;
		
		if(valorProd < produto.getValorCusto()) {
			//Este produto não pode ser vendido por uma valor abaixo do valor de custo
			return -1;
		} 
		
		return valorProd;
		
	}
	
	public float calculaValor() {
		float valorVenda = qtddItens*produto.getValorVenda();
		float desc = 0;
		if(produto.isPromocao() == true) {
			for (int i=0; i < qtddItens; i++) {
				desc = desc + efetuarDesconto(desconto);
			}
			return valorVenda = desc;
		}
		
		return valorVenda;
		
	}
	
	public float calcularComissao() {
		float comissao = calculaValor() * (vendedor.COMISSAO/100);
		return comissao;
	}
	
	
	
	public String imprimir() {
		String toReturn = "";
		toReturn += " Vendedor: cod ";
		toReturn += getVendedor().getCod();
		toReturn += " - "+ getVendedor().getNome();
		toReturn += "\n Comissão: R$"+ calcularComissao();
		toReturn += "\n Quantidade de itens: "+ getQtddItens();
		toReturn += "\n Produto: cod "+produto.getCod() + " - "+produto.getDescricao();
		toReturn += "\n Valor de venda do produto (sem desconto): R$" + produto.getValorVenda();
		toReturn += "\n Produto em promoção? ";
		if(produto.isPromocao()) {
			toReturn += "Sim";
		}else {
			toReturn += "Não";
		}
		toReturn += "\n Valor do desconto: "+ getDesconto() + "% - R$"+ produto.getValorVenda()*(getDesconto()/100);
		if (calculaValor() < 0) {
			return "O produto não pode ser vendido por um valor abaixo do valor de custo: ";
		} else {
			toReturn += "\n Valor total da venda: R$" + calculaValor();
		}
		
		
		return toReturn;
	}
	
	
}
