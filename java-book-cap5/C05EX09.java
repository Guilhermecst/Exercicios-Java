package br.com.cap5;

/*
 * Considerando-se como exemplo o string "   Programa��o com Java   " que possui antes do
 * primeiro caractere e depois do �ltimo caractere de toda a sequ�ncia tr�s espa�os em
 * branco em cada extremidade, o programa dever� apresentar a mensagem com e sem os espa�os
 * existentes nas extremidades.
 */

public class C05EX09 {

	public static void main(String[] args) {
		
		String TEXTO = "   Programa��o com Java   ";
		
		System.out.println("Com espa�os: [" + TEXTO + "]");
		System.out.println("Sem espa�os: [" + TEXTO.trim() + "]");
	}

}
