package exerc1.cap4;

/*
 * Ler a temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
 * A fórmula de conversão poderá ser F = (9 * C + 160) / 5, em que a variável F re-
 * presenta a temperatura em graus Fahrenheite e a variável C é a temperatura em
 * graus Celsius.
 */

import java.util.Scanner;

public class EXERC04EX1B {

	public static void main(String[] args) {
		
		double C;
		double F;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Informe o valor que deseja converter: ");
		C = s.nextDouble();
		
		F = (9 * C + 160) / 5;
		
		System.out.println(C + "ºC em Fahrenheit é: " + F + "ºF");
		
	}

}
