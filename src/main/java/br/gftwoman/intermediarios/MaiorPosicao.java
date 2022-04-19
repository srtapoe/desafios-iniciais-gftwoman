package br.gftwoman.intermediarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        for(int i =0; i<100; i++){
            System.out.println("Digite um número: ");
            int numero = dadosEntrada.nextInt();
            numeros.add(numero);
        }

        Integer max = Collections.max(numeros);
        System.out.println("Maior: " + max);
        int position = numeros.indexOf(max)+1;
        System.out.println("Posição do maior: " + position);
    }
}
