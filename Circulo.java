import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
       
        final double PI = Math.PI;

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

       
        double area = PI * raio * raio;

        
        System.out.println("A área do círculo é: " + area);
    }
}