package exercicio13;

import java.util.Scanner;

public class Pessoa {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Infomme seu nome: ");
		String nome = leitor.nextLine();
		System.out.println("Infome sua idade:  ");
		int idade = leitor.nextInt();
		System.out.println("Informe seu altura: ");
		float altura = leitor.nextFloat(); 
		
		System.out.println("Nome: " + nome + ", Idade: "+ idade + ", Altura: "+ altura);
	}
	
}
