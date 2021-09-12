package exercicio15e16e17e18;

import java.util.Scanner;

/*  15.Implemente um programa que receba dados digitados pelo usu�rio e atribua
 *  a uma vari�vel do tipo String e imprima a frase inserida no console.
 *  
 *  16.Concatene na vari�vel criada acima a frase � � Exemplo String�.
 *  
 *  17.Imprima na tela (console) o n�mero de caracteres da String.
 *  
 *  18. Crie uma nova String, pegando o peda�o da primeira String que compreenda
 *	a frase �Exemplo String�.
 */

public class ImprimirFrase {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Exercicio 15
		System.out.println("Exercicio 15");
		System.out.println("Escreva uma frase: ");
		String frase = leitor.nextLine();
		System.out.println("Frase: "+ frase);
		
		//Exercicio 16 
		System.out.println("Exercicio 16");
		System.out.println("Frase: "+ frase +" - Exemplo String");
		
		//Exercicio 17
		System.out.println("Exercicio 17");
		String frase2 = frase + " - Exemplo String";
		System.out.println("N�mero de caracteres da 1� String: "+ frase.length());
		System.out.println("N�mero de caracteres da 1� String sem espa�os: "+ frase.replaceAll("\\s+","").length());
		System.out.println("N�mero de caracteres da 2� String: "+ frase2.length());
		System.out.println("N�mero de caracteres da 2� String sem espa�os: "+ frase2.replaceAll("\\s+","").length());
		
		//Exercicio 18
		System.out.println("Exercicio 18");
		if(frase.contains("Exemplo String")) {
			System.out.println("A  1� String contem: 'Exemplo String' em seu texto ->" + frase);
		} else {
			System.out.println("A  1� String n�o contem: 'Exemplo String' em seu texto ->" + frase);
		}
		if(frase2.contains("Exemplo String")) {
			System.out.println("A  2� String contem: 'Exemplo String' em seu texto ->" + frase2);
		} else {
			System.out.println("A  2� String n�o contem: 'Exemplo String' em seu texto ->" + frase2);
		}
		
	}
	
}
