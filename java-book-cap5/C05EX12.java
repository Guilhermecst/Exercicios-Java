package br.com.cap5;

/*
 * O exemplo a seguir demonstra a convers�o de um valor num�rico real de precis�o dupla
 * para o seu equivalente em String. Ao se definir o valor num�rico do tipo double o
 * programa apresenta o valor como sendo um String. 
 */

public class C05EX12 {

	public static void main(String[] args) {
		
		double VALOR = 23.78976;
		String STR;
		
		STR = Double.toString(VALOR);
		
		System.out.println("Valor = " + STR);
		
	}

}

// double para String
