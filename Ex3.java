import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNotas = 0;
        double somaNotas = 0;

        int excelente = 0;
        int bom = 0;
        int regular = 0;
        int insuficiente = 0;

        double nota;

        System.out.println("=== Cadastro de Notas ===");
        System.out.println("Digite as notas entre 0 e 10. Digite -1 para encerrar.");

        while (true) {
            System.out.print("Digite uma nota: ");
            nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                continue;
            }

            countNotas++;
            somaNotas += nota;

            if (nota >= 9) {
                System.out.println("Classificação: Colador profissinal");
                excelente++;
            } else if (nota >= 7) {
                System.out.println("Classificação: Adequado");
                bom++;
            } else if (nota >= 5) {
                System.out.println("Classificação: Aceitável");
                regular++;
            } else {
                System.out.println("Classificação: Pode melhorar");
                insuficiente++;
            }
        }

        if (countNotas > 0) {
            double media = somaNotas / countNotas;

            System.out.println("\n=== Resultado Final ===");
            System.out.printf("Média geral: %.2f\n", media);
            System.out.println("Excelente: " + excelente);
            System.out.println("Bom: " + bom);
            System.out.println("Regular: " + regular);
            System.out.println("Insuficiente: " + insuficiente);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
    }
}
