package br.com.cap5;

/* 
 * O exemplo a seguir demonstra a conversão de um dado do tipo lógico (boolean) para o seu
 * equivalente em inteiro (int). Ao se definir um valor lógico, o programa retornará seu 
 * resultado como inteiron. Nesse caso, o programa retorna 1 (um) se a condição for verda-
 * deira ou 0 (zero) se a condição for falsa. 
 */

public class C05EX28 {

	public static void main(String[] args) {
		
		boolean LOGICO = true;
		int INTEIRO;
		
		INTEIRO = (LOGICO)?1:0;
		
		System.out.println("Valor verdadeiro de LOGICO" + LOGICO);
		System.out.println("Valor verdadeiro de INTEIRO" + INTEIRO);

	}

}

// boolean para integer