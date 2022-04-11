package br.com.cap4;

import java.util.Scanner;

/*
 * O programa seguinte mostra, por meio da utilização do operador de conjunção &&, que
 * somente será apresentada a mensagem "O valor está entre 20 e 90" caso o valor forne-
 * cido para a variável NUMERO esteja entre 20 e 90. Qualquer valor fornecido fora da
 * faixa definida apresentará a mensagem "O valor não está entre 20 e 90.
 */

public class C04EX06 {

	public static void main(String args[]) {
		
		int NUMERO;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite um número: ");
		NUMERO = s.nextInt();
		
		if (NUMERO >= 20 && NUMERO <= 90)
			System.out.print("O valor está entre 20 e 90");
		else
			System.out.print("O valor não está entre 20 e 90");
		System.out.println();
		
	}

}
