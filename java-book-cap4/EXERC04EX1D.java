package exerc1.cap4;

/* Ler a temperatura em graus Celsius e apresentá-la convertida em graus Kelvin.
 * A fórmula de conversão poderá ser K = C + 273.15, em que a variável K re-
 * presenta a temperatura em graus Kelvin e a variável C é a temperatura em
 * graus Celsius.
 */

import java.util.Scanner;

public class EXERC04EX1D {

	public static void main(String[] args) {
		
		double C;
		double K;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Informe o valor que deseja converter: ");
		C = s.nextDouble();
		
		K = C + 273.15;
		
		System.out.println(C + "ºC em Kelvin é: " + K + "ºK");
		
	}

}