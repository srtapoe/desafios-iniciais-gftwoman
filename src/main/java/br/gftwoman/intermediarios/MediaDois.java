package br.gftwoman.intermediarios;

import java.util.Scanner;

public class MediaDois {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Digite a nota A: ");
        double notaA = dadosEntrada.nextDouble();

        System.out.println("Digite a nota B: ");
        double notaB = dadosEntrada.nextDouble();

        System.out.println("Digite a nota C: ");
        double notaC = dadosEntrada.nextDouble();

        int pesoA = 2;
        int pesoB = 3;
        int pesoC = 5;

        int somaPesos = pesoA + pesoB + pesoC;

        double mediaParcialA = notaA * pesoA;
        double mediaParcialB = notaB * pesoB;
        double mediaParcialC = notaC * pesoC;

        double mediaFinal = (mediaParcialA + mediaParcialB + mediaParcialC) / somaPesos;
        System.out.printf("MEDIA = %.1f", mediaFinal);

    }
}
