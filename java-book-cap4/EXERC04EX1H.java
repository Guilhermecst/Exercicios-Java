package exerc1.cap4;

/*
 * Calcular e apresentar o valor do volume de um gal�o, utilizando a f�rmula
 * V = 3.141592653589793 * R * R * A, em que as vari�veis: V, R e A representam,
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
		
		System.out.print("Informe o valor do raio do gal�o: ");
		System.out.print("Informe o valor da altura do gal�o: ");
		R = s.nextDouble();
		A = s.nextDouble();
		
		V = 3.141592653589793 * R * R * A;
		
		System.out.println("O volume do gal�o �: " + V);
		
	}

}
