package br.com.cap4;

/*
 * O programa a seguir apreasentará os valores numéricos inteiros de 1 à 5. Nesse caso
 * será necessário definir um contador para controlar a excução da apresentação dos va-
 * lores de 1 à 5 por meio de um contador. Assim, a cada vez que for executado o trecho
 * de apresentação do valor, o contador será incrementado de mais 1.
 */

public class C04EX17 {

	public static void main(String args[]) {
		
		int I;
		
		System.out.println();
		
		I = 1;
		
		while (I <= 5) {
			System.out.println("Valor = " + I);
			I = I + 1;
		}

	}

}
