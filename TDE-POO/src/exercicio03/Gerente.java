package exercicio03;


/*
 *  A heran�a neste caso esta no fato da classe Gerente est� herdando da classe Funcionario atrav�s da palavra reservada extends. 
 * 
 */
public class Gerente extends Funcionario{
	private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public  double calculaBonificacao(){
        return this.getSalario() * 0.6 + 100;
    }

}
