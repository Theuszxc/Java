import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar as notas das duas avaliações
        System.out.print("Digite a nota da primeira avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda avaliação: ");
        double nota2 = scanner.nextDouble();

        // Calcular a média final
        double media = (nota1 + nota2) / 2;

        // Exibir a média final
        System.out.println("A média final é: " + media);

        // Verificar se o aluno foi aprovado ou reprovado
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        // Fechar o scanner
        scanner.close();
    }
}