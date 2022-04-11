package br.com.cap4;

import java.io.*;

/*
 * O programa a seguir demonstra uma ocorrência de eerro típico, que tem a finalidade 
 * de apresentar o resultado da divisão de dois valores do tipo int.
 */

public class C04EX13 {

	public static void main(String args[]) {
		
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

		
		QUOCIENTE = DIVIDENDO / DIVISOR;
		
		System.out.println();
		System.out.print("Resultado = " + QUOCIENTE);
		System.out.println();
		
	}

}

/*
 * Ao executar o programa se o valor fornecido pelo usuário for 0 para o divisor o 
 * programa apresentará um erro de ArithmeticException, esse erro pode ser facil-
 * mente capturado com o bloco try para que o eventual erro seja tratado no bloco
 * catch, como pode-se ver no programa C04EX14.java.
 */
