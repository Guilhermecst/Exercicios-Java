package exerc1.cap4;

/*
 * Ler a temperatura em graus Kelvin e apresentá-la convertida em graus Fahrenheit.
 * A fórmula de conversão poderá ser F = (9 * (K - 273.15) + 160 / 5, em que a variá
 * vel K re-presenta a temperatura em graus Kelvin e a variável F é a temperatura em
 * graus Fahrenheit.
 */

import java.util.Scanner;

public class EXERC04EX1G {

	public static void main(String[] args) {
		
		double K;
		double F;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Informe o valor que deseja converter: ");
		K = s.nextDouble();
		
		F = (9 * (K - 273.15) + 160) / 5;
		
		System.out.println(K + "ºK em Fahrenheit é: " + F + "ºF");
		
	}

}

