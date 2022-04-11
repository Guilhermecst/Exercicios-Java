package br.com.cap4;

/**
 * Programa exemplo para c�uculo de tabuada de um valor qualquer fornecido a partir 
 * do teclado para opera��o em modo console.
 */

/*
 * Programa..........: Tabuada (C04EX24.java)
 * Autor(es).........: Guilherme Costa Silva
 * Data..............: 24/01/2022
 * Vers�o............: 1.0
 * Revis�o...........: -
 */

import java.util.Scanner;

public class C04EX24 {

	public static void main(String args[]) {
		
		int N, I, R;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Programa: Tabuada");
		System.out.println();
		System.out.print("Digite um valor inteiro para o c�uculo: ");
		N = s.nextInt();
		
		System.out.println();
		
		/**
		 * O trecho de c�digo seguinte � respons�vel pela apresenta��o da tabuada de um
		 * valor n�merico qualquer.
		 */
		
		for (I = 1; I <= 10; I++) {
			//C�uculo da tabuada propriamente dito.
			R = N * I;
			// Apresenta��p da tabuada no formato: N X I = R
			System.out.printf("%3d X %2d = %3d\n", N, I, R);
		}

	}

}
