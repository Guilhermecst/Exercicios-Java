package exerc2.cap4;

/* 
 * Ler quatro valores inteiros e apresentar somente aqueles que forem divis�veis 
 * por 2 ou 3
 */

import java.util.Scanner;

public class EXERC04EX2E {

	public static void main(String[] args) {
		
		
		int A;
		int B;
		int C;
		int D;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite o 1� valor: ");
		A = s.nextInt();
		
		System.out.print("Digite o 2� valor: ");
		B = s.nextInt();
		
		System.out.print("Digite o 3� valor: ");
		C = s.nextInt();
		
		System.out.print("Digite o 4� valor: ");
		D = s.nextInt();
		
		if (A % 2 == 0 || A % 3 == 0) {
			System.out.println(A + " � divis�vel por 2 e/ou 3");
		}
		if (B % 2 == 0 || B % 3 == 0) {
			System.out.println(B + " � divis�vel por 2 e/ou 3");
		}
		if (C % 2 == 0 || C % 3 == 0) {
			System.out.println(C + " � divis�vel por 2 e/ou 3");
		}
		if (D % 2 == 0 || D % 3 == 0) {
			System.out.println(D + " � divis�vel por 2 e/ou 3");
		}

	}

}
