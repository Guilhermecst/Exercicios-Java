package exerc1.cap4;

/*
 * Ler a temperatura em graus Fahrenheit e apresentá-la convertida em graus Kelvin.
 * A fórmula de conversão poderá ser K = (F - 32) * 5 / 9 + 273.15, em que a variável 
 * K re-presenta a temperatura em graus Kelvin e a variável F é a temperatura em
 * graus Fahrenheit.
 */

import java.util.Scanner;

public class EXERC04EX1F {

	public static void main(String[] args) {
		
		double F;
		double K;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Informe o valor que deseja converter: ");
		F = s.nextDouble();
		
		K = (F - 32) * 5 / 9;
		
		System.out.println(F + "ºF em Kelvin é: " + K + "ºK");
		
	}

}
