package exerc2.cap4;

/*
 * Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior
 * valor em relação ao menor valor.
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
		
		System.out.print("Digite o 1º número inteiro: ");
		A = s.nextInt();
		
		System.out.print("Digite o 2º número inteiro: ");
		B = s.nextInt();
		
		if (A > B) {
			diferenca = A - B;
			System.out.println("A diferença entre os número é: " + diferenca);
		}
		else {
			diferenca = B - A;
			System.out.println("A diferença entre os número é: " + diferenca);
		}
		

	}

}
