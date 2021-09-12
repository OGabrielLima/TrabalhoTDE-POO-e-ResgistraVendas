package exercicio28;

import java.util.Scanner;

public class identificaSexo {
	public static void main(String[] args) {
		
		String sexo;
		int idade = 0;
		int homemMaior = 0;
		int mulherMaior = 0;
		for(int i=0; i<10;i++) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("Infome seu sexo ('m' ou 'f'): ");
			sexo = leitor.nextLine();
			
			System.out.println("Infome sua idade: ");
			idade = leitor.nextInt();
			
			if (sexo.equals("m") && idade >= 18) {
				homemMaior = homemMaior + 1; 
			}
			
			if (sexo.equals("f") && idade >= 18) {
				mulherMaior = mulherMaior + 1; 
			}
			
		}
		System.out.println("Homens maiores de idade: "+homemMaior );
		System.out.println("Mulheres maiores de idade: "+mulherMaior );
	}
}
