package exerc2.cap4;

/*
 * Ler um valor inteiro qualquer positivo ou negativo e apresentar o número lido como
 * valor positivo.
 */

import java.util.Scanner;

public class EXERC04EX2B {

	public static void main(String[] args) {
		
		int A;
		int resultado;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite um número inteiro, positivo ou negativo: ");
		A = s.nextInt();
		
		if (A < 0) {
			resultado = A * -1;
			System.out.println(resultado);
		}
		else {
			System.out.println(A);
		}

	}

}
