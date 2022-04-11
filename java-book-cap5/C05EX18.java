package br.com.cap5;

/* 
 * O exemplo a seguir demonstra a convers�o de um valor num�rico inteiro em seu equivalente
 * hexadecimal em tipo STRING. No exemplo apresentado, o valor inteiro 11 � mostrado como 
 * valor hexadecimal correspondente a B.
 */

public class C05EX18 {

	public static void main(String[] args) {
		
		int INTEIRO = 11;
		String HEXSTR;
		
		HEXSTR = Integer.toString(INTEIRO, 16).toUpperCase();
		
		System.out.println("Valor = " + HEXSTR);
	}

}

// integer para hexadecimal