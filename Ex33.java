import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int soma = 0;

        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º número: ");
            int numero = scanner.nextInt();

            soma += numero; // soma = soma + numero
            contador++;
        }

        double media = (double) soma / 10;

        System.out.println("A soma dos números é: " + soma);
        System.out.printf("A média dos números é: %.2f%n", media);
    }
}