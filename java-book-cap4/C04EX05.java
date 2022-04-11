package br.com.cap4;

import java.util.Scanner;

/*
 * O programa a seguir efetua a leitura de dois valores numéricos inteiros, em seguida
 * faz a adição dos valores. Caso o resultado obtido seja maior do que 10, o programa
 * apresentará a mensagem "Resultado ultrapassa o valor 10". Caso contrário o programa
 * apresentará a mensagem "Resultado não ultrapassa o valor 10"
 */

public class C04EX05 {

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
			System.out.print("Resultado ultrapassa o valor 10");
		else
			System.out.print("O resultado não ultrapassa o valor 10");
		System.out.println();

	}

}
