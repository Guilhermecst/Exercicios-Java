package exerc3.cap4;

/*
 * Apresentar os quadradosn dos n�meros inteiros de 15 a 200.
 */

public class EXERC04EX3A {

	public static void main(String[] args) {
		
		int num = 15;
		
		System.out.println();
		
		while (num <= 200) {
			System.out.println("A raiz quadrada de " + num + " �: " + Math.sqrt(num));
			num++;
		}
		
	}

}
