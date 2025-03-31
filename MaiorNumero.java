import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar os três números ao usuário
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        // Verificar o maior número
        int maior = num1; // Inicializar o maior como num1

        if (num2 > maior) {
            maior = num2; // Se num2 for maior, atualizar o maior
        }

        if (num3 > maior) {
            maior = num3; // Se num3 for maior, atualizar o maior
        }

        // Exibir o maior número
        System.out.println("O maior número é: " + maior);

        // Fechar o scanner
        scanner.close();
    }
}