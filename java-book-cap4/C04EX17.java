package br.com.cap4;

/*
 * O programa a seguir apreasentar� os valores num�ricos inteiros de 1 � 5. Nesse caso
 * ser� necess�rio definir um contador para controlar a excu��o da apresenta��o dos va-
 * lores de 1 � 5 por meio de um contador. Assim, a cada vez que for executado o trecho
 * de apresenta��o do valor, o contador ser� incrementado de mais 1.
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
