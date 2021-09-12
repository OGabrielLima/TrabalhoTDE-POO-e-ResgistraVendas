package registrandoUmaVenda;

public class RegistraVenda {
	public static void main(String[] args) {
		//Criar um produto que não esta em promoção
		Produto produto = new Produto(01, "Notebook Azus I5 4gb", 2300f, 1500, false);
		
		//Criar um vendedor
		Vendedor vendedor = new Vendedor("Jose", "Rua dos vendedores, 7080", 01);
		
		//Criar venda
		Venda venda = new Venda();
		venda.setProduto(produto);
		venda.setVendedor(vendedor);
		venda.setQtddItens(2);
		venda.calculaValor();
		venda.calcularComissao();
		System.out.println(venda.imprimir());
		
		
		//Criar um produto que esta em promoção
		Produto produto1 = new Produto(01, "Ferro de passar roupa", 100f, 80f, true);
		
		//Criar um vendedor
		Vendedor vendedor1 = new Vendedor("Ricardo", "Rua dos vendedores, 7090", 02);
		
		//Criar venda
		Venda venda1 = new Venda();
		venda1.setProduto(produto1);
		venda1.setVendedor(vendedor1);
		venda1.setDesconto(10);
		venda1.setQtddItens(3);
		venda1.calculaValor();
		venda1.calcularComissao();
		System.out.println("");
		System.out.println(venda1.imprimir());
		
		
		//Setar o produto e o vendedor do slide anterior na nova venda
		Venda venda2 = new Venda();
		venda2.setProduto(produto1);
		venda2.setVendedor(vendedor1);
		venda2.setDesconto(30);
		venda2.setQtddItens(2);
		venda2.calculaValor();
		venda2.calcularComissao();
		System.out.println("");
		System.out.println(venda2.imprimir());
		
		
	}
}
