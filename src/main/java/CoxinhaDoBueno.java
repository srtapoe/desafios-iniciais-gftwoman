import java.util.Scanner;

public class CoxinhaDoBueno {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Quantidade de coxinhas e participantes: ");
        String input = dadosEntrada.nextLine();

        String[] inputSplit = input.split(" ");
        double coxinhas = Double.parseDouble(inputSplit[0]);
        double participantes = Double.parseDouble(inputSplit[1]);

        double media = Double.parseDouble(String.valueOf(coxinhas))/Double.parseDouble(String.valueOf(participantes));

        System.out.printf("%.2f", media);

    }
}
