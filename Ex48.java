import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        double[] valores = new double[10];
        Scanner ler = new Scanner(System.in);

        
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o " + (i + 1) + "ª valor real: ");
            valores[i] = ler.nextDouble();

        }
        
        double soma = 0;
        for (int i = 1; i < valores.length; i += 2) {
            soma += valores[i];
            
        System.out.println("\n Soma dos valores em posições ímpares: " + soma);
        
        }
    }
}