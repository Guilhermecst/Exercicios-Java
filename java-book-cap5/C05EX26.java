package br.com.cap5;

/*
* O exemplo a seguir demonstra a conversão de um valor numérico definido como sequência
* de caracteres do tipo String como valor numérico do tipo long. No exemplo apresentado,
* o valor "10" será mostrado como 10 do tipo long.
*/

public class C05EX26 {

	public static void main(String[] args) {
		
		String STR = "10";
		long LONGO;
		
		LONGO = Long.valueOf(STR).longValue();
		
		System.out.println("Valor = " + LONGO);

	}

}

// String para long