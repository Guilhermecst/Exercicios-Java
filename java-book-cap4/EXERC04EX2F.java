package exerc2.cap4;

/*
 * Ler um valor inteiro que esteja entre a faixa num�rica 1 a 9. O programa deve indicar
 * uma das seguintes mensagens: "O valor est� na faixa permitida", caso o valor fornecido
 * esteja entre 1 e 9, ou "O valor n�o est� na faixa permitida", caso o valor seja < 0
 * ou > 9.
 */

import java.util.Scanner;

public class EXERC04EX2F {

	public static void main(String[] args) {
		
		int num;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite um n�mero inteiro entre 1 e 9: ");
		num = s.nextInt();
	
		
		if (num > 0 || num <= 9) {
			System.out.println("O valor est� na faixa permitida");
		}
		else {
			System.out.println("O valor n�o est� na faixa permitida");
		}
	}

}
