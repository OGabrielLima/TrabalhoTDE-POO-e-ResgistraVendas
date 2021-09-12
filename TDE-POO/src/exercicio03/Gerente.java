package exercicio03;


/*
 *  A herança neste caso esta no fato da classe Gerente está herdando da classe Funcionario através da palavra reservada extends. 
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
