package br.com.cap5;

/*
* O exemplo a seguir demonstra a convers�o de um valor num�rico definido como sequ�ncia
* de caracteres do tipo String como valor num�rico do tipo float. No exemplo apresentado,
* o valor "10" ser� mostrado como 10.0.
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