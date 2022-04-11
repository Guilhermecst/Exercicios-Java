package br.com.cap4;

import java.util.Scanner;

/*
 * Imagine agora uma situação na qual o usuário deseja executar o mesmo programa mais 
 * de uma vez mas não sabe ao certo quantas vezes irá fazer essa execução. Observe que
 * será difícil prever quantas vezes o usuário irá solicitar essa ação. Nesse caso, se-
 * rá necessário definir um segundo laço que seja executado enquanto a resposta do usuá-
 * rio para a execução do programa for SIM.
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
			System.out.print("Tecle: [1] para SIM / [2] para NÃO: ");
			RESP = s.nextInt();
			
		}

	}

}
