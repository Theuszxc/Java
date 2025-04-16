import java.util.Random;

public class Ex51 {
    public static void main(String[] args) {
        final int TAMANHO = 10;
        int[] numeros = new int[TAMANHO];
        int maior = 0;
        int menor = 100;
        int soma = 0;

        Random random = new Random();

        System.out.println("Vetor gerado com números aleatórios entre 0 e 100:");
        for (int i = 0; i < TAMANHO; i++) {
            numeros[i] = random.nextInt(101);
            System.out.println("Número[" + i + "] = " + numeros[i]);

            
            soma += numeros[i];

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        double media = (double) soma / TAMANHO;

        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.printf("Média dos números: %.2f\n", media);
    }
}
