package exerc2.cap4;

// Ler três valores inteiros e apresentá-los em ordem crescente.

import java.util.Scanner;

public class EXERC04EX2D {

	public static void main(String[] args) {
		
		int A;
		int B;
		int C;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite o 1º número inteiro: ");
		A = s.nextInt();
		
		System.out.print("Digite o 2º número inteiro: ");
		B = s.nextInt();
		
		System.out.print("Digite o 3º número inteiro: ");
		C = s.nextInt();
		
		if (A <= B && B <= C) {
			System.out.printf("A ordem crescente é: " + A + " " + B + " " + C);
		}
		else if (A <= C && C <= B) {
			System.out.printf("A ordem crescente é: " + A + " " + C + " " + B);
		}
		else if (B <= A && A <= C) {
			System.out.printf("A ordem crescente é: " + B + " " + A + " " + C);
		}
		else if (B <= C && C <= A) {
			System.out.printf("A ordem crescente é: " + B + " " + C + " " + A);
		}
		else if (C <= A && A <= B) {
			System.out.printf("A ordem crescente é: " + C + " " + A + " " + B);
		}
		else if (C <= B && B <= A) {
			System.out.printf("A ordem crescente é: " + C + " " + B + " " + A);
		}

	}

}
