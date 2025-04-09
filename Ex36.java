import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        int opcao;

        do {
             System.out.println("\n=== Menu Conta Corrente ===");
             System.out.println("1 - Depósito");
             System.out.println("2 - Saque");
             System.out.println("3 - Saldo");
             System.out.println("4 - Sair");
             System.out.print("Escolha uma opção: ");
             
             opcao = scanner.nextInt();

             switch (opcao) {
                 case 1:
                     System.out.print("Digite o valor para depósito: R$ ");
                     double deposito = scanner.nextDouble();
                     if (deposito > 0) {
                         saldo += deposito;
                         System.out.println("Depósito realizado com sucesso.");
                     } else {
                         System.out.println("Valor inválido para depósito.");
                     }
                     break;

                 case 2:
                     System.out.print("Digite o valor para saque: R$ ");
                     double saque = scanner.nextDouble();
                     if (saque > 0 && saque <= saldo) {
                         saldo -= saque;
                         System.out.println("Saque realizado com sucesso.");
                     } else {
                         System.out.println("Saque inválido. Verifique o saldo ou o valor informado.");
                     }
                     break;

                 case 3:
                     System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
                     break;

                 case 4:
                     System.out.println("Encerrando o programa. Obrigado!");
                     break;

                 default:
                     System.out.println("Opção inválida. Tente novamente.");
             }

         } while (opcao != 4);
     }
 }