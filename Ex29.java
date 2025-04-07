import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos têm matriculados na sua academia? ");
        int totalAlunos = scanner.nextInt();

        int contador = 0;
        double somaPesos = 0;

        while (contador <= totalAlunos) {
            System.out.print("Digite o peso do aluno " + (contador + 1) + ": ");
            double peso = scanner.nextDouble();
            somaPesos += peso;
            contador++;
        }

        double media = somaPesos / totalAlunos;
        System.out.printf("A média do peso dos alunos é: %.2f kg%n", media);
    }
}