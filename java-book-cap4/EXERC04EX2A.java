package exerc2.cap4;

/*
 * Ler dois valores num�ricos inteiros e apresentar o resultado da diferen�a do maior
 * valor em rela��o ao menor valor.
 */

import java.util.Scanner;

public class EXERC04EX2A {

	public static void main(String[] args) {
		
		int A;
		int B;
		int diferenca;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite o 1� n�mero inteiro: ");
		A = s.nextInt();
		
		System.out.print("Digite o 2� n�mero inteiro: ");
		B = s.nextInt();
		
		if (A > B) {
			diferenca = A - B;
			System.out.println("A diferen�a entre os n�mero �: " + diferenca);
		}
		else {
			diferenca = B - A;
			System.out.println("A diferen�a entre os n�mero �: " + diferenca);
		}
		

	}

}
