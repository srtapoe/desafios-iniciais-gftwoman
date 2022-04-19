package br.gftwoman.basicos;

import java.util.Scanner;

public class DegustacaoVinho {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Resposta Certa: ");
        String respostaCerta = dadosEntrada.nextLine();

        String palpitesParticipants = dadosEntrada.nextLine();

        String [] palpitesSplit = palpitesParticipants.split(" ");
        int participanteA = Integer.parseInt(palpitesSplit[0]);
        int participanteB = Integer.parseInt(palpitesSplit[1]);
        int participanteC = Integer.parseInt(palpitesSplit[2]);
        int participanteD = Integer.parseInt(palpitesSplit[3]);
        int participanteE= Integer.parseInt(palpitesSplit[4]);

        int qtdeRespostasCertas = 0;

        for(int i =0; i< palpitesSplit.length;i++){
            if(palpitesSplit[i].equalsIgnoreCase(respostaCerta))
                qtdeRespostasCertas++;

        }

        System.out.println(qtdeRespostasCertas);
    }
}
