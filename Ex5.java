import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double juros = 0.02;

        System.out.println(" Simulador de Empréstimo com Juros Compostos ");

        while (true) {
            
            System.out.print("Digite o valor do empréstimo (ou -1 para sair): R$ ");
            double valorEmprestimo = scanner.nextDouble();

            if (valorEmprestimo == -1) {
                System.out.println("Saindo do simulador...");
                break;
            }

            
            System.out.print("Digite a quantidade de parcelas: ");
            int parcelas = scanner.nextInt();

            
            double valorFinal = valorEmprestimo * Math.pow(1 + juros, parcelas);

            
            double parcela = valorFinal / parcelas;

            
            System.out.printf("\nResultado do Empréstimo:\n");
            System.out.printf("Valor do Empréstimo: R$ %.2f\n", valorEmprestimo);
            System.out.printf("Número de Parcelas: %d\n", parcelas);
            System.out.printf("Valor Final com Juros Compostos: R$ %.2f\n", valorFinal);
            System.out.printf("Valor de cada Parcela: R$ %.2f\n", parcela);

            System.out.println("\nDeseja simular outro empréstimo? (s/n): ");
            char resposta = scanner.next().charAt(0);
            if (resposta != 's' && resposta != 'S') {
                System.out.println("Saindo do simulador...");
                break;
            }
        }
    }
}
