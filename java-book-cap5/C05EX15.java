package br.com.cap5;

/*
 * O exemplo a seguir demonstra a conversão de um valor numérico binário que deve ser for-
 * necido como sendo uma sequência de caracteres para o seu equivalente em inteiro. No 
 * exemplo apresentado, o valor hexadecimal 1010 é mostrado como valor inteiro correspon-
 * dente a 10.
 */

public class C05EX15 {

	public static void main(String[] args) {
		
		String BINSTR = "1010";
		int INTEIRO;
		
		INTEIRO = Integer.valueOf(BINSTR, 2).intValue();
		
		System.out.println("Valor = " + INTEIRO);
		
	}

}

//binário para integer