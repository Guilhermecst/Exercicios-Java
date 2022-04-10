package exerc1.cap4;

/*
 * Escrever um algoritmo e um programa para ler dois valores para as variáveis A e B, 
 * efetuar a troca dos valores de forma que a variável A passe a possuir o valor da 
 * variável B e que a variável B passe a possuir o valor da variável A. Apresentar os 
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
 
        System.out.print("Informe o valor da variável A: ");
        A = s.nextInt();
 
        System.out.print("Informe o valor da variável B: ");
        B = s.nextInt();
 
        troca = A;
        A = B;
        B = troca;
 
        System.out.println("O valor de A é: " + A);
        System.out.println("O valor de B é: " + B);
		
	}
	
}
