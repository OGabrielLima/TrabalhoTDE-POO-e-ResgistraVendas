package exercicio25;

public class Calculadora {
	public static void main(String[] args) {
		int soma = 0;
		float mult = 1;
		for(int i=1; i<=30; i++) {
			if(i%2 != 0) {
				soma = soma + i;
				
			} else {
				mult = mult * i;
			}
			
		}
		System.out.println("Soma dos impares: "+ soma);
		System.out.println("Multiplicação dos pares: "+ mult);
	}
}
