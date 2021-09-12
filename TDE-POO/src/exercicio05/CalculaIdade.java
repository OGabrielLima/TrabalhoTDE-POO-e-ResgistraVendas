package exercicio05;

import java.util.Scanner;


public class CalculaIdade {
	//Atribuindo o main que é onde será executado o programa.
	public static void main(String[] args) {
		
		//Chama o Scanner que é uma função que nos permite ler dados do teclado a partir do programa
		Scanner leitor = new Scanner(System.in);
		
		//Escreve informações na tela
		System.out.println("Informe seu ano de nascimento: ");
		//Lê a informação do ano de nascimento do teclado
		int nasc = leitor.nextInt();
		
		System.out.println("Informe seu ano atual: ");
		//Lê a informação do ano atual do teclado
		int ano = leitor.nextInt();
		
		//Variável que recebera o valor do calculo
		int idade;
		
		//faz o calculo
		idade = ano - nasc;
	
		//Imprime as informação da idade com base no ano no console
		System.out.println(idade);
	}
}
