import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int cedulas100 = 10; 
        int cedulas50 = 10;  
        int cedulas20 = 10;  
        int cedulas10 = 10;  
        int cedulas5 = 10;   

        System.out.println("=== Caixa Eletrônico ===");
        System.out.print("Digite o valor do saque: R$ ");
        int valorSaque = scanner.nextInt();

        
        if (valorSaque % 5 != 0) {
            System.out.println("Erro: O valor do saque precisa ser múltiplo de 5.");
            scanner.close();
            return;
        }

        
        int cedulas100Usadas = 0, cedulas50Usadas = 0, cedulas20Usadas = 0;
        int cedulas10Usadas = 0, cedulas5Usadas = 0;
        int valorRestante = valorSaque;

        
        if (valorRestante >= 100 && cedulas100 > 0) {
            cedulas100Usadas = Math.min(valorRestante / 100, cedulas100);
            valorRestante -= cedulas100Usadas * 100;
        }

        
        if (valorRestante >= 50 && cedulas50 > 0) {
            cedulas50Usadas = Math.min(valorRestante / 50, cedulas50);
            valorRestante -= cedulas50Usadas * 50;
        }

        
        if (valorRestante >= 20 && cedulas20 > 0) {
            cedulas20Usadas = Math.min(valorRestante / 20, cedulas20);
            valorRestante -= cedulas20Usadas * 20;
        }

        
        if (valorRestante >= 10 && cedulas10 > 0) {
            cedulas10Usadas = Math.min(valorRestante / 10, cedulas10);
            valorRestante -= cedulas10Usadas * 10;
        }

        
        if (valorRestante >= 5 && cedulas5 > 0) {
            cedulas5Usadas = Math.min(valorRestante / 5, cedulas5);
            valorRestante -= cedulas5Usadas * 5;
        }

        
        if (valorRestante > 0) {
            System.out.println("Erro: Não é possível realizar o saque com as cédulas disponíveis.");
        } else {
            
            System.out.println("Saque realizado com sucesso!");
            if (cedulas100Usadas > 0) {
                System.out.println("Cédulas de R$100: " + cedulas100Usadas);
            }
            if (cedulas50Usadas > 0) {
                System.out.println("Cédulas de R$50: " + cedulas50Usadas);
            }
            if (cedulas20Usadas > 0) {
                System.out.println("Cédulas de R$20: " + cedulas20Usadas);
            }
            if (cedulas10Usadas > 0) {
                System.out.println("Cédulas de R$10: " + cedulas10Usadas);
            }
            if (cedulas5Usadas > 0) {
                System.out.println("Cédulas de R$5: " + cedulas5Usadas);
            }
        }
    }
}

