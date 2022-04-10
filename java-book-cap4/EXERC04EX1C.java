package exerc1.cap4;

/*
 * Ler a temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.
 * A fórmula de conversão poderá ser C = ((F - 32) * 5) / 9, em que a variável F re-
 * presenta a temperatura em graus Fahrenheite e a variável C é a temperatura em
 * graus Celsius.
 */

import java.util.Scanner;

public class EXERC04EX1C {

	public static void main(String[] args) {
		
		double F;
		double C;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Informe o valor que deseja converter: ");
		F = s.nextDouble();
		
		C = ((F - 32) * 5) / 9;
		
		System.out.println(F + "ºF em Celsius é: " + C + "ºC");
		
	}

}
