import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar a idade do usuário
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Verificar se o usuário tem 18 anos ou mais
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

    }
}