import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        int[] valores = new int[20];
        Scanner ler = new Scanner(System.in);

        
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o " + (i + 1) + "ª número inteiro: ");
            valores[i] = ler.nextInt();

        }

        System.out.println("\n Valores na ordem oposta:");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }
}