package br.com.cap5;

/*
 * O exemplo a seguir demonstra a convers�o de um valor num�rico definido como sequ�ncia
 * de caracteres do tipo String como valor num�rico do tipo double. No exemplo apresentado,
 * o valor "10.89" ser� mostrado como 10.89.
 */

public class C05EX23 {

	public static void main(String[] args) {
		
		String STR = "10.89";
		double VALOR;
		
		VALOR = Double.valueOf(STR).doubleValue();
		
		System.out.println("Valor = " + VALOR);
		
	}
	
}

// String para double