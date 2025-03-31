import java.util.Scanner;

public class CreditoEspecial {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo médio
        System.out.print("Digite o saldo médio do cliente: ");
        double saldoMedio = scanner.nextDouble();

        // Variável para armazenar o valor do crédito
        double credito;

        // Verificando a faixa de saldo e calculando o crédito
        if (saldoMedio >= 0 && saldoMedio <= 200) {
            credito = 0;  // Nenhum crédito
        } else if (saldoMedio >= 201 && saldoMedio <= 400) {
            credito = saldoMedio * 0.20;  // 20% do saldo médio
        } else if (saldoMedio >= 401 && saldoMedio <= 600) {
            credito = saldoMedio * 0.30;  // 30% do saldo médio
        } else if (saldoMedio > 600) {
            credito = saldoMedio * 0.40;  // 40% do saldo médio
        } else {
            // Caso o valor seja negativo, o programa exibe uma mensagem de erro
            System.out.println("Saldo médio inválido!");
            scanner.close();
            return;  // Encerra o programa se o valor for inválido
        }

        // Exibindo o saldo médio e o valor do crédito
        System.out.printf("Saldo médio: R$ %.2f%n", saldoMedio);
        System.out.printf("Valor do crédito: R$ %.2f%n", credito);
    }
}