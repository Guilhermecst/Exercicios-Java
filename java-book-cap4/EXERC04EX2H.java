package exerc2.cap4;

/*
 * Ler um n�mero inteiro qualquer e apresentar se o n�mero informado � par ou �mpar.
 */

import java.util.Scanner;

public class EXERC04EX2H {

	public static void main(String[] args) {
		
		int num;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite um n�mero inteiro: ");
		num = s.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " � par");
		}
		else {
			System.out.println(num + " � �mpar");
		}
	}

}
