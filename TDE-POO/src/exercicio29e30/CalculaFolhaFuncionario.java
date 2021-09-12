package exercicio29e30;

import java.util.Scanner;

public class CalculaFolhaFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o número de horas trabalhadas: ");
		
		float horas = leitor.nextFloat();
		
		
		float salario = funcionario.calculaSalario(horas);
		
		
		System.out.println("Salario: R$"+ salario);
		 
		//Exercicio 30
		if(salario < 50.00) {
			System.out.println("Atenção, dirija- se à direção do Hotel!");
		}
	}
}
