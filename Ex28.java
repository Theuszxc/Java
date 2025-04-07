import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Insira o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Quantas vezes deseja fazer o cálculo de adição? ");
        int N = scanner.nextInt();

        int contador = 0;
        int soma = 0;

        while (contador < N) {
            soma += num1 + num2;
            System.out.println("Soma parcial (" + (contador + 1) + "): " + soma);
            contador++;
        }
    }
}
