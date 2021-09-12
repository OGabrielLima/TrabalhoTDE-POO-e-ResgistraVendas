package exercicio32;

import java.util.Scanner;

public class AreaTrapezio {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira a altura: ");
		float h = leitor.nextFloat();
		
		System.out.println("Insira a base menor: ");
		float b = leitor.nextFloat();
		
		System.out.println("Insira a base maior: ");
		float B = leitor.nextFloat();
		
		float area = (b*(b+B))/2;
				
		System.out.println("Área do trapezio: "+ area);
	}
}
