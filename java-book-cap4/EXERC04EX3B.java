package exerc3.cap4;

/*
 * Apresentar a soma dos 100 primeiros números inteiros, representados pela sequência:
 * 1 + 2 + 3 + 4 + 5 +...97 + 98 + 99 + 100.
 */

public class EXERC04EX3B {

	public static void main(String[] args) {
		
		int soma = 0;
		int i = 0;
		
		System.out.println();
		
        while(i <= 100) {
            soma += i;
            i++;
        }
        
        System.out.println(soma);

	}

}
