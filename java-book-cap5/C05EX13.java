package br.com.cap5;

/*
 * O exemplo a seguir demonstra a conversão de um valor numérico real de precisão simples
 * para o seu equivalente em String. Ao se definir o valor numérico do tipo float o
 * programa apresenta o valor como sendo um String. 
 */

public class C05EX13 {

	public static void main(String[] args) {
		
		float VALOR = 35;
		String STR;
		
		STR = Float.toString(VALOR);
		
		System.out.println("Valor = " + STR);
		
	}

}

// float para String