package exerc1.cap4;

/*
 * Escrever um algoritmo e um programa para efetuar o c�lculo da quantidade de litros 
 * de combust�vel gastos em uma viagem, utilizando-se um autom�vel que faz 12 km por 
 * litro. Para obter o c�lculo, o usu�rio dever� fornecer o tempo gasto na viagem e a 
 * velocidade m�dia durante a mesma. Desta forma, ser� poss�vel obter a dist�ncia per-
 * corrida com a f�rmula DIST�NCIA = TEMPO * VELOCIDADE. Tendo o valor da dist�ncia, 
 * basta calcular a quantidade de litros de combust�vel utilizada na viagem com a f�r-
 * mula: LITROS_USADOS = DIST�NCIA / 12. O programa dever� apresentar a dist�ncia per-
 * corrida e a quantidade de litros de combust�vel utilizados na viagem.
 */

import java.util.Scanner;

public class EXERC04EX1A {

    public static void main(String[] args) {
    	 
        double tempoGastoNaViagem;
        double velocidadeMedia;
        double distancia;
        double litros_usados;
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        
        System.out.println();
 
        System.out.print("Informe o tempo gasto na viagem: ");
        tempoGastoNaViagem = s.nextDouble();
 
        System.out.print("Informe a velocidade m�dia: ");
        velocidadeMedia = s.nextDouble();
 
        distancia = tempoGastoNaViagem * velocidadeMedia;
 
        litros_usados = (distancia / 12);
 
        System.out.println("A dist�ncia percorrida �: " + distancia);
        System.out.println("A quantidade de litros utilizados �: " + litros_usados);
    }
}
		