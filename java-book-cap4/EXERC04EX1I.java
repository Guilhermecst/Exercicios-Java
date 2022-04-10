package exerc1.cap4;

/*
 * Calcular e apresentar o valor do peso de uma esfera, utilizando a fórmula
 * de conversão P = D * 4 * 3.141592653589793 * R * R * R / 3. em que as vari-
 * áveis: P, D e R representam, respectivamente, o peso, a densidade e o raio.
 */

import java.util.Scanner;

public class EXERC04EX1I {

	public static void main(String[] args) {
		
		double P;
		double D;
		double R;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Informe o valor da densidade da esfera: ");
		System.out.println("Informe o valor do raioda esfera: ");
		D = s.nextDouble();
		R = s.nextDouble();
				
		P = D * 4 * 3.141592653589793 * R * R * R / 3;
		
		System.out.println("O peso da esfera é: " + P);
		

	}

}
