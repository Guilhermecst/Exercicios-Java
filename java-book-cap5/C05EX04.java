package br.com.cap5;

/*
 * Considerando-se como exemplo os strings "PROGRAMA��O COM JAVA" e "programa��o com java"
 * o programa seguinte demonstra o uso dos m�todos equals() e equalsIgnoreCase() para a 
 * verifica��o de se ambos os strings s�o iguais ou diferentes.
 */

public class C05EX04 {

	public static void main(String[] args) {
		
		String TEXTO1 = "PROGRAMA��O COM JAVA";
		String TEXTO2 = "programa��o com java";
		
		System.out.println();
		
		if (TEXTO1.equals(TEXTO2))
			System.out.println("Os textos s�o iguais");
		else
			System.out.println("Os textos s�o diferentes");
		
		if (TEXTO1.equalsIgnoreCase(TEXTO2))
			System.out.println("Os textos s�o iguais");
		else
			System.out.println("Os textos s�o diferentes");
		
	}

}
