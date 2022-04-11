package br.com.cap5;

/* 
 * O exemplo a seguir demonstra a convers�o de um valor num�rico inteiro em seu equivalente
 * bin�rio em tipo STRING. No exemplo apresentado, o valor inteiro 10 � mostrado como 
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

// integer para bin�rio 