package exerc1.cap4;

/*
 * Ler a temperatura em graus Fahrenheit e apresent�-la convertida em graus Celsius.
 * A f�rmula de convers�o poder� ser C = ((F - 32) * 5) / 9, em que a vari�vel F re-
 * presenta a temperatura em graus Fahrenheite e a vari�vel C � a temperatura em
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
		
		System.out.println(F + "�F em Celsius �: " + C + "�C");
		
	}

}
