package exercicio24;

public class Moto extends Veiculo {
	public static void buzinar() {
		System.out.println("buzinando");
	}
	
	public static void main(String[] args) {
		abastecer();
		acelerar();
		buzinar();
		frear();
		
		
	}
	
	
}
