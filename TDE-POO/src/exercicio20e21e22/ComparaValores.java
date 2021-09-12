package exercicio20e21e22;

import java.util.Scanner;

public class ComparaValores {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Exercicio 20
		System.out.println("Exercicio 20");
		System.out.println("Insira do valor abaixo: ");
		int valorInt = leitor.nextInt();
		if(valorInt < 15 || valorInt > 100) {
			System.out.println("O valor é menor de 15 ou maior que 100");
		} else {
			System.out.println("O valor esta no intervalor de 15 até 100");
		}
		
		System.out.println("Exercicio 21");
		System.out.println("Insira do valor abaixo: ");
		Float valorFloat = leitor.nextFloat();
		if(valorFloat >= 1.99 || valorFloat <= 5.99 ) {
			System.out.println("O valor é menor de 1.99 ou maior que 5.99");
		} else {
			System.out.println("O valor esta no intervalor de 1.99 até 5.99");
		}
		
		System.out.println("Exercicio 22");
		
		if(valorFloat == valorInt ) {
			System.out.println("O valor das 2 variaveis acima é igual");
		} else {
			System.out.println("O valor das 2 variaveis acima é diferente");
		}
	}
}
