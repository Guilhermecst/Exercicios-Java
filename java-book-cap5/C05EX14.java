package br.com.cap5;

/*
 * O exemplo a seguir demonstra a conversão de um valor numérico hexadecimal que deve
 * ser fornecido como sendo uma sequência de caracteres para o seu equivalente em inteiro.
 * No exemplo apresentado, o valor hexadecimal A é mostrado como valor inteiro correspon-
 * dente a 10.
 */

public class C05EX14 {

	public static void main(String[] args) {
		
		String HEXSTR = "A";
		int INTEIRO;
		
		INTEIRO = Integer.valueOf(HEXSTR, 16).intValue();
		
		System.out.println("Valor = " + INTEIRO);
		
	}

}

// hexadecimal para integer