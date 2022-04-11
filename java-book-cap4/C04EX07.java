package br.com.cap4;

import java.util.Scanner;

/*
 * O programa a seguir efetua a leitura de um valor númerico inteiro referente aos códi-
 * gos: 1, 2 e 3. Qualquer outro valor deve apresentar a mensagem "Código inválido". Se
 * o valor estuiver correto, apresentará o valor do código escrito por extenso.
 */

public class C04EX07 {

	public static void main(String args[]) {
		
		int CODIGO;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite o código de acesso: ");
		CODIGO = s.nextInt();
		
		if (CODIGO == 1 || CODIGO == 2 || CODIGO == 3) {
			if (CODIGO == 1)
				System.out.print("Um");
			if (CODIGO == 2)
				System.out.print("Dois");
			if (CODIGO == 3)
				System.out.print("Três");
		}
		else
			System.out.print("Código Inválido");
		
		System.out.println();
		
	}

}
