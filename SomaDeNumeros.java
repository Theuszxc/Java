import java.util.Scanner;

public class SomaDeNumeros {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        double soma = 0;

       
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        
        System.out.println("A soma dos 10 números é: " + soma);
    }
}