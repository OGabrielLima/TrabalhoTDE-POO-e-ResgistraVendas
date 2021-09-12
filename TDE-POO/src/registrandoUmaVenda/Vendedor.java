package registrandoUmaVenda;

public class Vendedor {
	private String nome;
	private int cod;
	public static float COMISSAO = 15.0f;
	private String endereco;
	
	public Vendedor(String nome, String endereco, int cod) {
		this.nome = nome;
		this.endereco = endereco;
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public static float getCOMISSAO() {
		return COMISSAO;
	}

	public static void setCOMISSAO(float cOMISSAO) {
		COMISSAO = cOMISSAO;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
