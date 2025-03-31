import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados de hora e minuto de entrada e saída
        System.out.print("Digite a hora de entrada: ");
        int HE = scanner.nextInt();
        System.out.print("Digite os minutos de entrada: ");
        int ME = scanner.nextInt();
        
        System.out.print("Digite a hora de saída: ");
        int HS = scanner.nextInt();
        System.out.print("Digite os minutos de saída: ");
        int MS = scanner.nextInt();

        // Convertendo o tempo de entrada e saída para minutos
        int tempoEntradaEmMinutos = HE * 60 + ME;
        int tempoSaidaEmMinutos = HS * 60 + MS;

        // Calculando a diferença em minutos
        int tempoEstacionado = tempoSaidaEmMinutos - tempoEntradaEmMinutos;

        // Corrigir caso a saída seja no dia seguinte (ou seja, hora de saída é menor que hora de entrada)
        if (tempoEstacionado < 0) {
            tempoEstacionado += 24 * 60; // Adiciona 24 horas (1440 minutos)
        }

        // Calculando o número de horas completas
        int horasCompletas = (int) Math.ceil(tempoEstacionado / 60.0); // Arredonda para cima

        // Calculando o valor a ser pago
        double valorAPagar;

        if (horasCompletas == 1) {
            valorAPagar = 4.00;
        } else if (horasCompletas == 2) {
            valorAPagar = 6.00;
        } else {
            valorAPagar = 6.00 + (horasCompletas - 2) * 1.00;
        }

        // Exibindo o resultado
        System.out.printf("O valor a ser pago pelo estacionamento é: R$ %.2f%n", valorAPagar);
    }
}