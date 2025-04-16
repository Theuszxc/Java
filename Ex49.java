import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        final int TAMANHO = 10;
        int[] vetor1 = new int[TAMANHO];
         int[] vetor2 = new int[TAMANHO];
          int[] somaVetores = new int[TAMANHO];
        Scanner ler = new Scanner(System.in);
        
        System.out.println("\nDigite os 10 elementos do primeiro vetor:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Vetor1[" + i + "]: ");
            vetor1[i] = ler.nextInt();

        }
        
        System.out.println("\nDigite os 10 elementos do segundo vetor:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Vetor2[" + i + "]: ");
            vetor2[i] = ler.nextInt();
        }
        
        for (int i = 0; i < TAMANHO; i++) {
            somaVetores[i] = vetor1[i] + vetor2[i];
        }
        
        System.out.println("\nVetor resultado da soma dos vetores:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.println("Soma [" + i + "] = " + somaVetores[i]);
        }
    }
}