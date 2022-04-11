package br.com.cap5;

/* 
 * O exemplo a seguir demonstra a conversão de um valor numérico inteiro em seu equivalente
 * binário em tipo STRING. No exemplo apresentado, o valor inteiro 10 é mostrado como 
 * valor hexadecimal correspondente a 1010.
 */

public class C05EX19 {

	public static void main(String[] args) {
		
		int INTEIRO = 10;
		String BINSTR;
		
		BINSTR = Integer.toString(INTEIRO, 2);
		
		System.out.println("Valor = " + BINSTR);
		
	}

}

// integer para binário 