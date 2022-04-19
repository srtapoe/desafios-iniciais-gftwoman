package br.gftwoman.intermediarios;

import java.util.Scanner;

/**
 * Você pode usar o Math.PI no lugar da constante PI
 * porém a exatidão dos resultados irão variar
 */


public class Esfera {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = dadosEntrada.nextDouble();

        double PI =  3.14159;

        double volume = (4/3.0) * PI * (Math.pow(raio, 3.0));
        System.out.printf("VOLUME  = %.3f%n", volume);

    }
}
