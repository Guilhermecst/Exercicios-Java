package exerc1.cap4;

/*
 * Calcular e apresentar o valor do volume de um galão, utilizando a fórmula
 * V = 3.141592653589793 * R * R * A, em que as variáveis: V, R e A representam,
 * respectivamente, o volume, o raio e a altura.
 */

import java.util.Scanner;

public class EXERC04EX1H {

	public static void main(String[] args) {
		
		double V;
		double R;
		double A;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Informe o valor do raio do galão: ");
		System.out.print("Informe o valor da altura do galão: ");
		R = s.nextDouble();
		A = s.nextDouble();
		
		V = 3.141592653589793 * R * R * A;
		
		System.out.println("O volume do galão é: " + V);
		
	}

}
