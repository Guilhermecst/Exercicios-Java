package br.com.cap5;

/*
* O exemplo a seguir demonstra a conversão de um valor numérico definido como sequência
* de caracteres do tipo String como valor numérico do tipo int. No exemplo apresentado,
* o valor "10" será mostrado como 10 do tipo int.
*/

public class C05EX25 {

	public static void main(String[] args) {

		String STR = "10";
		int INTEIRO;
		
		INTEIRO = Integer.valueOf(STR).intValue();
		
		System.out.println("Valor = " + INTEIRO);
		
	}

}

// String para integer