package exercicio27;

import java.util.Scanner;

public class VerificaNumeroParImparPrimo {
	public static void main(String[] args) {
		System.out.println("Informe um número: ");
		Scanner leitor = new Scanner(System.in);
		int num = leitor.nextInt();
		int x = 0;
		int i = 0;
		for(i = 2, x = 2; i <= num; i++) {
            for(x = 2; x < i; x++) {
                if(i % x == 0) {
                    break;
                }
            }
            if(x == i && x == num) {
                System.out.println(x + " é primo");
            }
            
        }
		if(num % 2 == 0) {
        	System.out.println(num + " é par");
        } else {
        	System.out.println(num + " é impar");
        	
        }
	}
}
