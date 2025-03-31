import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as informações do usuário
        System.out.print("Digite o valor de um número inteiro: ");
        int n1 = scanner.nextInt();  // Declaração de n1 como inteiro
        System.out.print("Digite o valor de outro número inteiro: ");
        int n2 = scanner.nextInt();  // Declaração de n2 como inteiro

        // Verifica se n1 é par ou ímpar
        if (n1 % 2 == 0) {
            System.out.println("O número " + n1 + " é par!");
        } else {
            System.out.println("O número " + n1 + " é ímpar!");
        }

        // Verifica se n2 é par ou ímpar
        if (n2 % 2 == 0) {
            System.out.println("O número " + n2 + " é par!");
        } else {
            System.out.println("O número " + n2 + " é ímpar!");
        }
    }
}