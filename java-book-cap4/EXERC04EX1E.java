package exerc1.cap4;

/*
 * Ler a temperatura em graus Kelvin e apresentá-la convertida em graus Celsius.
 * A fórmula de conversão poderá ser C = K - 273.15, em que a variável K re-
 * presenta a temperatura em graus Kelvin e a variável C é a temperatura em
 * graus Celsius.
 */

import java.util.Scanner;

public class EXERC04EX1E {

	public static void main(String[] args) {
		
		double K;
		double C;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Informe o valor que deseja converter: ");
		K = s.nextDouble();
		
		C = K - 273.15;
		
		System.out.println(K + "ºK em Celsius é: " + C + "ºC");
		
	}

}
