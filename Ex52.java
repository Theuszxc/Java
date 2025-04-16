import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        final int QUANTIDADE = 5;
        int[] idades = new int[QUANTIDADE];
        int soma = 0;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < QUANTIDADE; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = ler.nextInt();
            soma += idades[i];
        }

        System.out.println("\nClassificação por idade:");
        for (int i = 0; i < QUANTIDADE; i++) {
            System.out.print("Pessoa " + (i + 1) + " - Idade: " + idades[i] + " - ");

            if (idades[i] < 12) {
                System.out.println("Criança");
            } else if (idades[i] < 60) {
                System.out.println("Adulto");
            } else {
                System.out.println("Idoso aposentado");
            }
        }

        System.out.println("\nSoma das idades: " + soma);
        ler.close();
    }
}

        