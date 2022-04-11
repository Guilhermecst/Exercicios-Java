package br.com.cap4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C04EX20 {

	public static void main(String args[]) {
		
		long X = 1_000_000, Y, R;
		DecimalFormat df = new DecimalFormat();
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Digite um valor inteiro (-128/127): ");
		Y = s.nextByte();
		
		R = X + Y + 3000000;
		
		df.applyPattern("#,###,##0");
		System.out.println("Resultado = " + df.format(R));
		
	}

}
