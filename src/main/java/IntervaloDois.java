import java.util.Scanner;

public class IntervaloDois {
    public static void main(String[] args) {

        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Digite quantidade de números a serem lidos: ");

        int qtadeNumerosLidos = dadosEntrada.nextInt();
        int numeroEntrada;

        int intervaloDezVinte = 0;
        int intervaloForaDezVinte = 0;
        int i = 0;


        for(i = 0; i<qtadeNumerosLidos;i++ ){
            System.out.println("Digite o número: ");
            numeroEntrada = dadosEntrada.nextInt();
            if(numeroEntrada>=10 && numeroEntrada <=20){
                intervaloDezVinte++;
            }else{
                intervaloForaDezVinte++;
            }
        }

        System.out.println("Quantidade dentro do intervalo: " + intervaloDezVinte);
        System.out.println("Quantidade Fora do intervalo: " + intervaloForaDezVinte);

    }
}
