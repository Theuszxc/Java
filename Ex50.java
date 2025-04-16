import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        final int TAMANHO = 10;
        double[] compras = new double[TAMANHO];
        double totalCompra = 0;
        double imposto;
        double totalComImposto;
        Scanner ler = new Scanner(System.in);

        
        System.out.println("\nDigite os 10 valores dos itens de compra:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Valor do item " + (i + 1) + ": ");
            compras[i] = ler.nextDouble();
            totalCompra += compras[i];
        }

        if (totalCompra > 1200) {
            imposto = totalCompra * 0.025;
        } else {
            imposto = totalCompra * 0.008;
        }

        totalComImposto = totalCompra + imposto;

        System.out.printf("\nTotal da compra: R$ %.2f\n", totalCompra);
        System.out.printf("Imposto: R$ %.2f\n", imposto);
        System.out.printf("Total com imposto: R$ %.2f\n", totalComImposto);

        
        int[] vetor1 = new int[TAMANHO];
        int[] vetor2 = new int[TAMANHO];
        int[] somaVetores = new int[TAMANHO];

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
            System.out.println("Soma[" + i + "] = " + somaVetores[i]);
        }
    }
}
