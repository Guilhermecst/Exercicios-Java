package br.com.cap4;

import java.util.Scanner;

/*
 * O programa a seguir é uma simplificação do programa C04EX18.java.
 */

public class C04EX19 {

	public static void main(String[] args) {
		
		int I, RESP = 1;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		while (RESP == 1) {
			
			System.out.println();
			
			I = 1;
			while (I <= 5) {
				System.out.println("Valor = " + I);
				I++;
			}
			
			System.out.println();
			System.out.println("Deseja continuar?");
			System.out.print("Tecle: [1] para SIM / [2] para NÃO");
			RESP = s.nextInt();
			
		}

	}

}
