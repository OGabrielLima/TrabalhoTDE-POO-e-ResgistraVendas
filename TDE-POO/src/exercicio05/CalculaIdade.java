package exercicio05;

import java.util.Scanner;


public class CalculaIdade {
	//Atribuindo o main que � onde ser� executado o programa.
	public static void main(String[] args) {
		
		//Chama o Scanner que � uma fun��o que nos permite ler dados do teclado a partir do programa
		Scanner leitor = new Scanner(System.in);
		
		//Escreve informa��es na tela
		System.out.println("Informe seu ano de nascimento: ");
		//L� a informa��o do ano de nascimento do teclado
		int nasc = leitor.nextInt();
		
		System.out.println("Informe seu ano atual: ");
		//L� a informa��o do ano atual do teclado
		int ano = leitor.nextInt();
		
		//Vari�vel que recebera o valor do calculo
		int idade;
		
		//faz o calculo
		idade = ano - nasc;
	
		//Imprime as informa��o da idade com base no ano no console
		System.out.println(idade);
	}
}
