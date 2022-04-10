package exerc1.cap4;

/*
 * Ler a temperatura em graus Fahrenheit e apresent�-la convertida em graus Kelvin.
 * A f�rmula de convers�o poder� ser K = (F - 32) * 5 / 9 + 273.15, em que a vari�vel 
 * K re-presenta a temperatura em graus Kelvin e a vari�vel F � a temperatura em
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
		
		System.out.println(F + "�F em Kelvin �: " + K + "�K");
		
	}

}
