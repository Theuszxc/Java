import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Digite a quantidade de números: ");
        int N = ler.nextInt();
        
        int[] valores = new int[N];
        int countPares = 0;
        int produtoImpares = 1;

        System.out.println("Digite os " + N + " valores inteiros:");
        
        
        for (int i = 0; i < N; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = ler.nextInt();
            
            if (valores[i] % 2 == 0) {
                countPares++;
            } else {
                produtoImpares *= valores[i];
            }
        }

        
        System.out.println("\nQuantidade de números pares: " + countPares);
        
        if (produtoImpares == 1 && countPares != N) {
            
            System.out.println("Não há números ímpares para multiplicar.");
        } else {
            System.out.println("Produto dos números ímpares: " + produtoImpares);
        }
    }
}
