package br.gftwoman.intermediarios;

import java.util.Scanner;

public class PoligonosRegularesSiimples {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Digite o n° de lados e o comprimento de um lado: ");
        String ladosComprimento = dadosEntrada.nextLine();

        String[] ladosComprimentoSplit = ladosComprimento.split(" ");

        int qtdeLados = Integer.parseInt(ladosComprimentoSplit[0]);
        int comprimentoLados = Integer.parseInt(ladosComprimentoSplit[1]);

        int perimetroPoligono = qtdeLados * comprimentoLados;
        System.out.println(perimetroPoligono);

    }
}
