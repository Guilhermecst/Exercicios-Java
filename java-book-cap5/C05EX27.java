package br.com.cap5;

/*
* O exemplo a seguir demonstra a convers�o de um valor num�rico definido como sequ�ncia
* de caracteres do tipo String como valor num�rico do tipo byte. No exemplo apresentado,
* o valor "10" ser� mostrado como 10 do tipo byte.
*/

public class C05EX27 {

	public static void main(String[] args) {
		
		String STR = "10";
		byte CURTO;
		
		CURTO = Byte.valueOf(STR).byteValue();
		
		System.out.println("Valor = " + CURTO);

	}

}

// String para byte