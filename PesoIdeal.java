import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().toUpperCase().charAt(0);  // Pegando o primeiro caractere e transformando em maiúsculo

        // Variável para armazenar o peso ideal
        double pesoIdeal;

        // Cálculo do peso ideal com base no sexo
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido! Utilize 'M' para masculino ou 'F' para feminino.");
            return;  // Encerra o programa em caso de entrada inválida
        }

        // Exibindo o resultado
        System.out.printf("O peso ideal para uma pessoa de altura %.2f metros e sexo %c é: %.2f kg%n", altura, sexo, pesoIdeal);
    }
}