package exerc2.cap4;

/*
 * Ler 5 valores inteiros e apresentar o maior e o menor valor entre os n�meros informados
 */

import java.util.Scanner;

public class EXERC04EX2G {

	public static void main(String[] args) {
	
		int A;
		int B;
		int C;
		int D;
		int E;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite o 1� n�mero: ");
		A = s.nextInt();
		
		System.out.print("Digite o 2� n�mero: ");
		B = s.nextInt();
		
		System.out.print("Digite o 3� n�mero: ");
		C = s.nextInt();
		
		System.out.print("Digite o 4� n�mero: ");
		D = s.nextInt();
		
		System.out.print("Digite o 5� n�mero: ");
		E = s.nextInt();
		
		int maior = 0;
		int menor = 999999999;
		
		if (A > maior) {
			maior = A;
		}
		if (A < menor) {
			menor = A;
		}
		
		if (B > maior) {
			maior = B;
		}
		if (B < menor) {
			menor = B;
		}
		
		if (C > maior) {
			maior = C;
		}
		if (C < menor) {
			menor = C;
		}
		
		if (D > maior) {
			maior = D;
		}
		if (D < menor) {
			menor = D;
		}
		
		if (E > maior) {
			maior = E;
		}
		if (E < menor) {
			menor = E;
		}
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
		
	}
}
