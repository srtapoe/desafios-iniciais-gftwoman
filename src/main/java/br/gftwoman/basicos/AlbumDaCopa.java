package br.gftwoman.basicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AlbumDaCopa {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Quantidade total de figurinhas: ");
        int totalFigurinhas = dadosEntrada.nextInt();

        System.out.println("Quantidade de figurinhas compradas: ");
        int qtdeFigurinhasCompradas = dadosEntrada.nextInt();

        List<Integer> figurinhas = new ArrayList<>();

        for(int i = 0; i<qtdeFigurinhasCompradas; i++){
            System.out.println("Figurinha comprada: ");
            int figurinha = dadosEntrada.nextInt();
            figurinhas.add(figurinha);
        }

        int figurinhasSemRepetidas = figurinhas.stream()
                .distinct()
                .collect(Collectors.toList())
                .size();

        int faltamParaCompletarAlgum = totalFigurinhas - figurinhasSemRepetidas;
        System.out.println(faltamParaCompletarAlgum);

    }
}
