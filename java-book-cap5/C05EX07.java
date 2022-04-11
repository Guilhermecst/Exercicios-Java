package br.com.cap5;

/*
 * O programa seguinte efetuará o desmenbramento do string "Programação" em quatro segmentos,
 * identificados como "Pro", "gra", "ma" e "ção".
 */

public class C05EX07 {

	public static void main(String[] args) {
		
		String TEXTO = "PROGRAMAÇÃO";
		
		System.out.println(TEXTO.substring(0, 3));
		System.out.println(TEXTO.substring(3, 6));
		System.out.println(TEXTO.substring(6, 8));
		System.out.println(TEXTO.substring(8, 11));
		
	}

}
