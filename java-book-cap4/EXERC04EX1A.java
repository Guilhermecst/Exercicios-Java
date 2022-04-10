package exerc1.cap4;

/*
 * Escrever um algoritmo e um programa para efetuar o cálculo da quantidade de litros 
 * de combustível gastos em uma viagem, utilizando-se um automóvel que faz 12 km por 
 * litro. Para obter o cálculo, o usuário deverá fornecer o tempo gasto na viagem e a 
 * velocidade média durante a mesma. Desta forma, será possível obter a distância per-
 * corrida com a fórmula DISTÂNCIA = TEMPO * VELOCIDADE. Tendo o valor da distância, 
 * basta calcular a quantidade de litros de combustível utilizada na viagem com a fór-
 * mula: LITROS_USADOS = DISTÂNCIA / 12. O programa deverá apresentar a distância per-
 * corrida e a quantidade de litros de combustível utilizados na viagem.
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
 
        System.out.print("Informe a velocidade média: ");
        velocidadeMedia = s.nextDouble();
 
        distancia = tempoGastoNaViagem * velocidadeMedia;
 
        litros_usados = (distancia / 12);
 
        System.out.println("A distância percorrida é: " + distancia);
        System.out.println("A quantidade de litros utilizados é: " + litros_usados);
    }
}
		