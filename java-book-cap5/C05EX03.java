package br.com.cap5;

/*
 * Considerando-se comoo exemplo os Strings "Olá, " e "Mundo!" o programa seguinte
 * demonstra o uso do método concat() para a obtenção da mensagem "Olá, Mundo!". 
 */

public class C05EX03 {

	public static void main(String[] args) {
		
		String TEXTO1 = "Olá, ";
		String TEXTO2 = "Mundo!";
		
		System.out.println();
		System.out.println(TEXTO1.concat(TEXTO2));
		System.out.println(TEXTO1 + TEXTO2);

	}

}
