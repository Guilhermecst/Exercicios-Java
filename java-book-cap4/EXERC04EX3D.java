package exerc3.cap4;

/*
 * Apresentar todos os números divisíveis por 4 que sejam menores que 30.
 */

public class EXERC04EX3D {

	public static void main(String[] args) {
		
		int num = 1;
		
		System.out.println();
		
		while (num < 30) {
			if (num % 4 == 0) {
				System.out.println(num + " é divisível por 4");
			}
			num++;
		}

	}

}
