package exerc2.cap4;

/*
 * Ler quatro valores reais referentes a quatro notas escolares de um aluno e apresentar
 * uma mensagem informando se o aluno foi aprovado ou reprovado. Para determinar a apro-
 * vação do aluno, considere a média escolar maior ou igual a 5. Apresentar junto das
 * mensagens o valor da média do aluno.
 */

import java.util.Scanner;

public class EXERC04EX2C {

	public static void main(String[] args) {
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite a 1ª nota: ");
		nota1 = s.nextInt();
		
		System.out.print("Digite a 2ª nota: ");
		nota2 = s.nextInt();
		
		System.out.print("Digite a 3ª nota: ");
		nota3 = s.nextInt();
		
		System.out.print("Digite a 4ª nota: ");
		nota4 = s.nextInt();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 5) {
			System.out.println("Média: " + media + " Situação: Aprovado");
		}
		else {
			System.out.println("Média: " + media + " Situação: Reprovado");
		}
	}
}
