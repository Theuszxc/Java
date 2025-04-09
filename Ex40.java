import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double total, preco = 3.78, litros;
        int valor, escolha;
        
        do {
            System.out.println("=== Combustível ===");
            System.out.println("1) Gasolina ");
            System.out.print("Escolha a opção (1): ");
            escolha = ler.nextInt();
            
            switch (escolha) {
                case 1:
                    System.out.println("Gasolina selecionada!");
                    System.out.println("=== Escolha ===");
                    System.out.println("1) Abastecer por valor");
                    System.out.println("2) Abastecer por Litro");
                    int forma = ler.nextInt();
                    
                    if (forma == 1) {
                        System.out.println("Abastecer por valor selecionado");
                        System.out.println("Valor da gasolina em R$ 3.78");
                        System.out.print("Qual o valor desejado? ");
                        valor = ler.nextInt();
                        
                        
                        total = valor / preco;
                        System.out.println("Você pode abastecer com um total de " + total + " Litros.");
                    } else if (forma == 2) {
                        System.out.println("Abastecer por litro selecionado");
                        System.out.println("Valor da gasolina em R$ 3.78");
                        System.out.print("Quantos litros deseja abastecer? ");
                        litros = ler.nextDouble();
                        
                        
                        total = litros * preco;
                        System.out.println("O total a ser pago é R$ " + total);
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
            
            System.out.print("Deseja realizar outro abastecimento? (1 para sim, 0 para não): ");
            escolha = ler.nextInt();
            
        } while (escolha == 1);
        
        
        System.out.println("Obrigado por utilizar o sistema de abastecimento!");
    }
}