import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxNumero = 0;

        System.out.println("=== Jogo de Adivinhação ===");
        System.out.println("Escolha a dificuldade:");
        System.out.println("1 - Fácil (1 a 10)");
        System.out.println("2 - Médio (1 a 50)");
        System.out.println("3 - Difícil (1 a 100)");
        System.out.print("Digite sua escolha: ");
        int dificuldade = scanner.nextInt();

        switch (dificuldade) {
            case 1:
                maxNumero = 10;
                break;
            case 2:
                maxNumero = 50;
                break;
            case 3:
                maxNumero = 100;
                break;
            default:
                System.out.println("Dificuldade inválida. Jogo encerrado.");
                scanner.close();
                return;
        }

        int numeroSecreto = random.nextInt(maxNumero) + 1;
        int tentativas = 5;
        boolean acertou = false;

        System.out.println("\nTente adivinhar o número entre 1 e " + maxNumero + ". Você tem " + tentativas + " tentativas.");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            int palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número!");
                acertou = true;
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("Dica: o número é MAIOR.");
            } else {
                System.out.println("Dica: o número é MENOR.");
            }
        }

        if (!acertou) {
            System.out.println("\nSuas tentativas acabaram. O número era: " + numeroSecreto);
        }
    }
}