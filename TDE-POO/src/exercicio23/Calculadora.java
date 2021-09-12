package exercicio23;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira do valor abaixo: ");
		int valorInt = leitor.nextInt();
		
		System.out.println("Insira do valor abaixo: ");
		double valorDouble = leitor.nextDouble();
				
		int multiplicacao = (int) (valorInt * valorDouble);
		
		System.out.println("Resultado: "+ multiplicacao);
		
		
	}
}
