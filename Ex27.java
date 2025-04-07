import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um nome: ");
        String nome = scanner.nextLine();

        System.out.print("Quantas vezes deseja repetir o nome? ");
        int N = scanner.nextInt();

        int numero = 0;

        while (numero < N) {
            System.out.println(nome);
            numero++;
        }
    }
}

