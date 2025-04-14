import java.util.Scanner;
import java.lang.Math;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("=== Resolver a Equação de 2º Grau ===");
        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();
        
        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        
        double delta = Math.pow(B, 2) - 4 * A * C;

        
        System.out.printf("Delta (Δ) = %.2f\n", delta);

        
        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else {
            
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);

            
            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f\n", x2);
        }
    }
}

