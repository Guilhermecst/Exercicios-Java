package br.com.cap4;

import java.util.Scanner;

/*
 * O programa a seguir efetua a leitura de dois valores num�ricos inteiros, em seguida
 * faz a adi��o dos valores. Caso o resultado obtido seja maior do que 10, o programa
 * apresentar� a mensagem "Resultado ultrapassa o valor 10". Caso contr�rio o programa
 * apresentar� a mensagem "Resultado n�o ultrapassa o valor 10"
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
			System.out.print("O resultado n�o ultrapassa o valor 10");
		System.out.println();

	}

}
