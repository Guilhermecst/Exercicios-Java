package br.com.cap4;

import java.util.Scanner;

/*
 * O programa a seguir efetua a leitura de dois valores numéricos inteiros, em seguida
 * faz a adição dos valores e apresenta o seu resultado, caso o valor somado seja maior
 * do que 10
 */

public class C04EX04 {

	public static void main(String args[]) {
		
		int A, B, R;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite o valor <A>: ");
		A = s.nextInt();
		
		System.out.print("Digite o valor <B>: ");
		B = s.nextInt();
		
		R = A + B;
		System.out.println();
		
		if (R > 10)
			System.out.print("Resultado = " + R);
		System.out.println();

	}

}
