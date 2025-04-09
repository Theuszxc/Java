import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int escolha;
        int qtdCamisas = 0;
        double precoPequena = 10.00, precoMedia = 12.00, precoGrande = 15.00;
        double totalArrecadado = 0.0;
        
        do {
            System.out.println("Qual tamanho de camisa você deseja?");
            System.out.println("1) Camisa P");
            System.out.println("2) Camisa M");
            System.out.println("3) Camisa G");
            System.out.print("Escolha a opção (1, 2, ou 3): ");
            escolha = ler.nextInt();
            
            int quantidade;
            switch (escolha) {
                case 1:
                    System.out.println("Camisa P selecionada!");
                    System.out.println("Custa R$10,00");
                    System.out.print("Quantas camisas P você deseja? ");
                    quantidade = ler.nextInt();
                    qtdCamisas += quantidade;
                    totalArrecadado += quantidade * precoPequena;
                    break;
                case 2:
                    System.out.println("Camisa M selecionada!");
                    System.out.println("Custa R$12,00");
                    System.out.print("Quantas camisas M você deseja? ");
                    quantidade = ler.nextInt();
                    qtdCamisas += quantidade;
                    totalArrecadado += quantidade * precoMedia;
                    break;
                case 3:
                    System.out.println("Camisa G selecionada!");
                    System.out.println("Custa R$15,00");
                    System.out.print("Quantas camisas G você deseja? ");
                    quantidade = ler.nextInt();
                    qtdCamisas += quantidade;
                    totalArrecadado += quantidade * precoGrande;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
           
            System.out.print("Deseja escolher outra camisa? (1 para sim, 0 para não): ");
            escolha = ler.nextInt();
            
        } while (escolha == 1);
        
       
        System.out.println("\nTotal de camisetas selecionadas: " + qtdCamisas);
        System.out.printf("Total arrecadado: R$ %.2f\n", totalArrecadado);
    }
}
