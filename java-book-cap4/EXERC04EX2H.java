package exerc2.cap4;

/*
 * Ler um número inteiro qualquer e apresentar se o número informado é par ou ímpar.
 */

import java.util.Scanner;

public class EXERC04EX2H {

	public static void main(String[] args) {
		
		int num;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite um número inteiro: ");
		num = s.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " é par");
		}
		else {
			System.out.println(num + " é ímpar");
		}
	}

}
