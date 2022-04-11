package br.com.cap5;

/*
* O exemplo a seguir demonstra a conversão de um valor numérico definido como sequência
* de caracteres do tipo String como valor numérico do tipo float. No exemplo apresentado,
* o valor "10" será mostrado como 10.0.
*/

public class C05EX24 {

	public static void main(String[] args) {
		
		String STR = "10";
		float VALOR;
		
		VALOR = Float.valueOf(STR).floatValue();
		
		System.out.println("Valor = " + VALOR);

	}

}

// String para float