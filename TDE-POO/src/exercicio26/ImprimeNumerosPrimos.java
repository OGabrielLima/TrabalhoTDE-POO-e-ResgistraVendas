package exercicio26;

public class ImprimeNumerosPrimos {
	public static void main(String[] args) {
		int x = 0;
		int i = 0;
		for(i = 2, x = 2; i <= 123; i++) {
            for(x = 2; x < i; x++) {
                if(i % x == 0) {
                    break;
                }
            }
            if(x == i) {
                System.out.println(x);
            }
        }
	}
}
