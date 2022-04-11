package br.com.cap4;

import java.io.*;

/* 
 * O programa a seguir mant�m a a��o de dividir dois valores n�mericos inteiros.
 */

public class C04EX15 {

	public static void main(String[] args) {
		
		int DIVIDENDO, DIVISOR, QUOCIENTE;
		
		System.out.println();
		
		System.out.print("Informe um valor do dividendo: ");
		try {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			DIVIDENDO = Integer.parseInt(br.readLine()); }
		catch (Exception e) {
			DIVIDENDO = 0;
		}
		
		System.out.print("Informe um valor do divisor: ");
		try {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			DIVISOR = Integer.parseInt(br.readLine()); }
		catch (Exception e) {
			DIVISOR = 0;
		}
		
		try {

		QUOCIENTE = DIVIDENDO / DIVISOR;
		
		if (DIVISOR == 0)
			throw new Exception();
		
		System.out.println();
		System.out.print("Resultado = " + QUOCIENTE);
		System.out.println();
		
		}
		
		catch (Exception e) {
			
			System.out.println();
			System.out.print("Erro de divis�o por zero!");
			System.out.println();
			
		}

	}

}