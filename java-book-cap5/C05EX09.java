package br.com.cap5;

/*
 * Considerando-se como exemplo o string "   Programação com Java   " que possui antes do
 * primeiro caractere e depois do último caractere de toda a sequência três espaços em
 * branco em cada extremidade, o programa deverá apresentar a mensagem com e sem os espaços
 * existentes nas extremidades.
 */

public class C05EX09 {

	public static void main(String[] args) {
		
		String TEXTO = "   Programação com Java   ";
		
		System.out.println("Com espaços: [" + TEXTO + "]");
		System.out.println("Sem espaços: [" + TEXTO.trim() + "]");
	}

}
