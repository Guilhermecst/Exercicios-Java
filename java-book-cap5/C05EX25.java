package br.com.cap5;

/*
* O exemplo a seguir demonstra a convers�o de um valor num�rico definido como sequ�ncia
* de caracteres do tipo String como valor num�rico do tipo int. No exemplo apresentado,
* o valor "10" ser� mostrado como 10 do tipo int.
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