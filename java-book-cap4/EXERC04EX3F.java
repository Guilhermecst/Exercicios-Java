package exerc3.cap4;

/* 
 * Apresentar o resultado inteiro do fatorial de um número qualquer.
 */

import java.util.Scanner;

public class EXERC04EX3F {

	public static void main(String[] args) {
		
		int fat = 1;
		int num;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite um número: ");
		num = s.nextInt();
		
		while (num > 1) {
			fat = fat * num;
			num--;
		}
		
		System.out.println(fat);
				
	}

}
