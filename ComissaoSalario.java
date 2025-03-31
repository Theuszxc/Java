import java.util.Scanner;

public class ComissaoSalario {
    public static void main(String[] args) {
        // Definindo o salário base
        double salarioBase = 1200.00;

        // Criando o scanner para ler o valor total vendido
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor total vendido
        System.out.print("Digite o total vendido pelo funcionário em abril: R$");
        double totalVendido = scanner.nextDouble();

        // Verificar se o funcionário tem direito à comissão
        double comissao = 0.00;
        if (totalVendido > 2000.00) {
            // Comissão de 10% sobre o total vendido
            comissao = totalVendido * 0.10;
        }

        // Calcular o salário bruto
        double salarioBruto = salarioBase + comissao;

        // Exibir os resultados
        System.out.printf("Comissão: R$%.2f\n", comissao);
        System.out.printf("Salário Bruto: R$%.2f\n", salarioBruto);
        
        // Fechar o scanner
        scanner.close();
    }
}