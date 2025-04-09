import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];
        double[] valores = new double[10];
        double total = 0;
        int i = 0;

        // Entrada dos produtos
        System.out.println("=== Cadastro de Produtos ===");
        while (i < 10) {
            System.out.print("Digite o nome do " + (i + 1) + "º produto: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite o valor do " + (i + 1) + "º produto: R$ ");
            valores[i] = scanner.nextDouble();
            scanner.nextLine();

            total += valores[i];
            i++;
        }

        // Exibir os produtos
        System.out.println("\n=== Lista de Produtos ===");
        i = 0;
        while (i < 10) {
            System.out.println((i + 1) + " - " + nomes[i] + " - R$ " + valores[i]);
            i++;
        }
        System.out.printf("Total da compra: R$ %.2f%n", total);

        // Menu de pagamento
        int opcao;
        double valorFinal = total;
        do {
            System.out.println("\n=== Formas de Pagamento ===");
            System.out.println("1 - À vista (desconto de 10%)");
            System.out.println("2 - Cartão de crédito (parcelado em 3 vezes sem juros)");
            System.out.println("3 - Cartão de débito (sem desconto)");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma forma de pagamento: ");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    valorFinal = total * 0.9; // 10% de desconto
                    System.out.printf("Pagamento à vista com 10%% de desconto. Total: R$ %.2f%n", valorFinal);
                    break;
                case 2:
                    System.out.printf("Pagamento parcelado em 3 vezes sem juros. Total: R$ %.2f%n", total);
                    break;
                case 3:
                    System.out.printf("Pagamento com cartão de débito. Total: R$ %.2f%n", total);
                    break;
                case 4:
                    System.out.println("Saindo do programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);
    }
}
