package registrandoUmaVenda;

public class Produto {
	private int cod;
	private String descricao;
	private float valorVenda;
	private float valorCusto;
	private boolean promocao;
	
	public Produto(	 int cod, String descricao, float valorVenda, float valorCusto, boolean promocao) {
		this.cod = cod;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCusto = valorCusto;
		this.promocao = promocao;
		
	}
	public Produto() {
		
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public float getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(float valorCusto) {
		this.valorCusto = valorCusto;
	}

	public boolean isPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
}
