package br.com.cap4;

import java.util.Scanner;

/* 
 * Al�m das formas apresentadas, a linguagem Java 7 permite o uso de multi-catch.
 * Para fazer uso desse recurso, o c�digo de programa seguinte ser� uma varia��o
 * do c�digo de programa C04EX16.java, em que os trechos de c�digo controlados 
 * pela classe BufferedReader ser�o substitu�dos pela classe Scanner.
 */

public class C04EX16A {

	public static void main(String[] args) throws ArithmeticException {
		
		int DIVIDENDO, DIVISOR, QUOCIENTE;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		try {

			System.out.print("Informe um valor do dividendo: ");
			DIVIDENDO = s.nextInt();
			
			System.out.print("Informe um valor do divisor: ");
			DIVISOR = s.nextInt();
			
			QUOCIENTE = DIVIDENDO / DIVISOR;
			
			System.out.println();
			System.out.print("Resultado = " + QUOCIENTE);
			System.out.println();
			
		}
		
		catch (final Exception erro) {
			
			System.out.println();
			System.out.print("Erro de divis�o por zero ou outro erro.\n");
			System.out.print("Tipo de exce��o: " + erro + ".");
			System.out.println();
			
		}

	}

}