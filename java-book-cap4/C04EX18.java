package br.com.cap4;

import java.util.Scanner;

/*
 * Imagine agora uma situa��o na qual o usu�rio deseja executar o mesmo programa mais 
 * de uma vez mas n�o sabe ao certo quantas vezes ir� fazer essa execu��o. Observe que
 * ser� dif�cil prever quantas vezes o usu�rio ir� solicitar essa a��o. Nesse caso, se-
 * r� necess�rio definir um segundo la�o que seja executado enquanto a resposta do usu�-
 * rio para a execu��o do programa for SIM.
 */

public class C04EX18 {

	public static void main(String[] args) {
		
		int I, RESP;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		RESP = 1;
		while (RESP == 1) {
			
			System.out.println();
			
			I = 1;
			while (I <= 5) {
				System.out.println("Valor = " + I);
				I++;
			}
			
			System.out.println();
			System.out.println("Deseja continuar?");
			System.out.print("Tecle: [1] para SIM / [2] para N�O: ");
			RESP = s.nextInt();
			
		}

	}

}
