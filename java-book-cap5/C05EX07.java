package br.com.cap5;

/*
 * O programa seguinte efetuar� o desmenbramento do string "Programa��o" em quatro segmentos,
 * identificados como "Pro", "gra", "ma" e "��o".
 */

public class C05EX07 {

	public static void main(String[] args) {
		
		String TEXTO = "PROGRAMA��O";
		
		System.out.println(TEXTO.substring(0, 3));
		System.out.println(TEXTO.substring(3, 6));
		System.out.println(TEXTO.substring(6, 8));
		System.out.println(TEXTO.substring(8, 11));
		
	}

}
