package br.com.cap5;

/*
 * Considerando-se como exemplo os strings "PROGRAMAÇÃO COM JAVA" e "programação com java"
 * o programa seguinte demonstra o uso dos métodos equals() e equalsIgnoreCase() para a 
 * verificação de se ambos os strings são iguais ou diferentes.
 */

public class C05EX04 {

	public static void main(String[] args) {
		
		String TEXTO1 = "PROGRAMAÇÃO COM JAVA";
		String TEXTO2 = "programação com java";
		
		System.out.println();
		
		if (TEXTO1.equals(TEXTO2))
			System.out.println("Os textos são iguais");
		else
			System.out.println("Os textos são diferentes");
		
		if (TEXTO1.equalsIgnoreCase(TEXTO2))
			System.out.println("Os textos são iguais");
		else
			System.out.println("Os textos são diferentes");
		
	}

}
