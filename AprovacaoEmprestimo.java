import java.util.Scanner;

public class AprovacaoEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as informações do usuário
        System.out.print("Digite o valor do empréstimo: R$ ");
        double valorEmprestimo = scanner.nextDouble();

        System.out.print("Digite o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        System.out.print("Digite o seu salário: R$ ");
        double salario = scanner.nextDouble();

        // Calcula o valor de cada parcela
        double valorParcela = valorEmprestimo / numeroParcelas;

        // Calcula 30% do salário
        double limiteParcelas = salario * 0.30;

        // Verifica se o valor da parcela é maior que 30% do salário
        if (valorParcela <= limiteParcelas) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo não aprovado. O valor da parcela excede 30% do seu salário.");
        }

        scanner.close();
    }
}