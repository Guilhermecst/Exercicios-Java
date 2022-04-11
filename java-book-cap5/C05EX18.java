package br.com.cap5;

/* 
 * O exemplo a seguir demonstra a conversão de um valor numérico inteiro em seu equivalente
 * hexadecimal em tipo STRING. No exemplo apresentado, o valor inteiro 11 é mostrado como 
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