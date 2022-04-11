package br.com.cap5;

/*
* O exemplo a seguir demonstra a conversão de um valor numérico definido como sequência
* de caracteres do tipo String como valor numérico do tipo byte. No exemplo apresentado,
* o valor "10" será mostrado como 10 do tipo byte.
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