package br.com.cap4;

import java.util.Scanner;

/*
 * O programa seguinte mostra, por meio da utiliza��o do operador de conjun��o &&, que
 * somente ser� apresentada a mensagem "O valor est� entre 20 e 90" caso o valor forne-
 * cido para a vari�vel NUMERO esteja entre 20 e 90. Qualquer valor fornecido fora da
 * faixa definida apresentar� a mensagem "O valor n�o est� entre 20 e 90.
 */

public class C04EX06 {

	public static void main(String args[]) {
		
		int NUMERO;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite um n�mero: ");
		NUMERO = s.nextInt();
		
		if (NUMERO >= 20 && NUMERO <= 90)
			System.out.print("O valor est� entre 20 e 90");
		else
			System.out.print("O valor n�o est� entre 20 e 90");
		System.out.println();
		
	}

}
