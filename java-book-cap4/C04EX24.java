package br.com.cap4;

/**
 * Programa exemplo para cáuculo de tabuada de um valor qualquer fornecido a partir 
 * do teclado para operação em modo console.
 */

/*
 * Programa..........: Tabuada (C04EX24.java)
 * Autor(es).........: Guilherme Costa Silva
 * Data..............: 24/01/2022
 * Versão............: 1.0
 * Revisão...........: -
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
		System.out.print("Digite um valor inteiro para o cáuculo: ");
		N = s.nextInt();
		
		System.out.println();
		
		/**
		 * O trecho de código seguinte é responsável pela apresentação da tabuada de um
		 * valor númerico qualquer.
		 */
		
		for (I = 1; I <= 10; I++) {
			//Cáuculo da tabuada propriamente dito.
			R = N * I;
			// Apresentaçãp da tabuada no formato: N X I = R
			System.out.printf("%3d X %2d = %3d\n", N, I, R);
		}

	}

}
