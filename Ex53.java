import java.util.Arrays;
import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        final int TAMANHO = 10;
        double[] valores = new double[TAMANHO];
        Scanner ler = new Scanner(System.in);

        
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite o valor real " + (i + 1) + ": ");
            valores[i] = ler.nextDouble();
        }

        
        double[] crescente = valores.clone();
        Arrays.sort(crescente);
        System.out.println("\nValores em ordem crescente:");
        for (double valor : crescente) {
            System.out.println(valor);
        }

        
        double[] decrescente = valores.clone();
        Arrays.sort(decrescente);
        System.out.println("\nValores em ordem decrescente:");
        for (int i = decrescente.length - 1; i >= 0; i--) {
            System.out.println(decrescente[i]);
        }

        
        System.out.println("\nValores na ordem inversa da entrada:");
        for (int i = TAMANHO - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }
}
