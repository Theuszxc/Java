import java.util.Scanner;

public class BônusFuncionario {
    public static void main(String[] args) {
        // Criando o scanner para capturar os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário do funcionário
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        // Solicita o tempo de serviço do funcionário
        System.out.print("Digite o tempo de serviço (em anos) do funcionário: ");
        int tempoDeServico = scanner.nextInt();

        // Variável para armazenar o valor do bônus
        double bonus;

        // Calcula o bônus baseado no tempo de serviço
        if (tempoDeServico >= 5) {
            // Funcionário com 5 anos ou mais recebe 20% de bônus
            bonus = salario * 0.20;
        } else {
            // Funcionário com menos de 5 anos recebe 10% de bônus
            bonus = salario * 0.10;
        }

        // Exibe o valor do bônus
        System.out.println("O valor do bônus recebido é: R$ " + bonus);
    }
}