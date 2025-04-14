import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        String[] pessoas = new String[5];
        Scanner ler = new Scanner(System.in);

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da " + (i + 1) + "ª pessoa: ");
            pessoas[i] = ler.nextLine();

            System.out.print("Digite o número da " + (i + 1) + "ª pessoa: ");
            numeros[i] = ler.nextInt();
            ler.nextLine();
        }

        
        System.out.println("\nInformações digitadas:");
        for (int i = 0; i < 5; i++) {
            System.out.println(pessoas[i] + " - Número: " + numeros[i]);
        }
    }
}
