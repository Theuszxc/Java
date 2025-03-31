import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o ano de nascimento do rapaz
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Obtém o ano atual
        int anoAtual = 2025; // Você pode usar a classe Calendar para pegar o ano atual dinamicamente

        // Calcula a idade
        int idade = anoAtual - anoNascimento;

        // Verifica a situação do alistamento
        if (idade < 18) {
            int anosFaltando = 18 - idade;
            System.out.println("Você ainda não tem 18 anos. Faltam " + anosFaltando + " ano(s) para o alistamento.");
        } else if (idade == 18) {
            System.out.println("Você tem 18 anos. Está na hora de se alistar.");
        } else {
            int anosPassados = idade - 18;
            System.out.println("Você já tem " + anosPassados + " ano(s) de atraso no alistamento.");
        }
    }
}