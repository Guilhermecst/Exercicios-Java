package exerc1.cap4;

/*
 * Escrever um algoritmo e um programa para ler dois valores para as vari�veis A e B, 
 * efetuar a troca dos valores de forma que a vari�vel A passe a possuir o valor da 
 * vari�vel B e que a vari�vel B passe a possuir o valor da vari�vel A. Apresentar os 
 * valores trocados.
 */

import java.util.Scanner;

public class EXERC04EX1J {

	public static void main(String[] args) {
		
		int A;
        int B;
        int troca;
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        
        System.out.println();
 
        System.out.print("Informe o valor da vari�vel A: ");
        A = s.nextInt();
 
        System.out.print("Informe o valor da vari�vel B: ");
        B = s.nextInt();
 
        troca = A;
        A = B;
        B = troca;
 
        System.out.println("O valor de A �: " + A);
        System.out.println("O valor de B �: " + B);
		
	}
	
}
