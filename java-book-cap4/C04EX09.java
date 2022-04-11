package br.com.cap4;

import java.util.Scanner;

/*
 * O exemplo seguinte apresenta, por meio da utilização do operador !, que somente será
 * efetuado o calculo de X = (A + B) * C se o valor da variável x não for maior que 5.
 * Qualquer valor de 5 para baixo efetuará o cálculo X = (A - B) * C.
 */

public class C04EX09 {

	public static void main(String args[]) {
		
		int A, B, C, X;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite o valor <A>: ");
		A = s.nextInt();
		
		System.out.print("Digite o valor <B>: ");
		B = s.nextInt();
		
		System.out.print("Digite o valor <C>: ");
		C = s.nextInt();
		
		if (!(C > 5))
			X = (A + B) * C;
		else
			X = (A - B) * C;
		System.out.println("Oresultado de X equivale a: " + X);
		
		System.out.println();

	}

}
