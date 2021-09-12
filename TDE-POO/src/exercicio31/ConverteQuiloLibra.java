package exercicio31;

import java.util.Scanner;

public class ConverteQuiloLibra {
	public static void main(String[] args) {
		//existe 454g em uma libra
		int opcao = 0;
		float l = 454;
		float q = 1000;
		float valgramas = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Deseja converter: ");
		System.out.println("01 - Quilo para Libra?");
		System.out.println("02 - Libra para Quilo?");
		opcao = leitor.nextInt();
		
		if (opcao == 1) {
			//Quilo para Libra
			System.out.println("Valor em Quilo: ");
			float quilo = leitor.nextFloat();
			//converte para gramas
			valgramas = quilo * q;
			float result = valgramas / l;
			System.out.println("Resultado: "+ result+ " l");
		} else if (opcao == 2) {
			//Libra para Quilo
			System.out.println("Valor em Libras: ");
			float libras = leitor.nextFloat();
			//converte para gramas
			valgramas = libras * l;
			float result = valgramas / q;
			System.out.println("Resultado: "+ result+ " q");
		} else {
			System.out.println("Comando inválido, tente novamente.");
		}
		
		
		
		
	}
}
