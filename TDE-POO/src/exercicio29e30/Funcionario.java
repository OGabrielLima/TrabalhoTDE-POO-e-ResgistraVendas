package exercicio29e30;

public class Funcionario {
	private float salario;

	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float calculaSalario(float horas) {
		float salario = horas * 10.25f;
		return salario;
	}
	
}
