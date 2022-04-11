package br.com.cap4;

import java.io.*;

/* 
 * O programa a seguir � uma r�plica do programa C04EX13.java, por�m nessa vers�o trata-
 * remos o erro de ArithmeticException para caso o usu�rio forne�a o n�mero 0 para o di-
 * visor apresentando a mensagem "Erro de divis�o por zero".
 */

public class C04EX14 {

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
		
		System.out.println();
		System.out.print("Resultado = " + QUOCIENTE);
		System.out.println();
		
		}
		
		catch (ArithmeticException ae) {
			
			System.out.println();
			System.out.print("Erro de divis�o por zero!");
			System.out.println();
			
		}

	}

}
