import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;

        int voto;

        System.out.println("Sistema de Votação");
        System.out.println("Vote em um dos candidatos abaixo:");
        System.out.println("1 - Candidato 1");
        System.out.println("2 - Candidato 2");
        System.out.println("3 - Candidato 3");
        System.out.println("Digite 0 para encerrar a votação.");

        do {
            System.out.print("Digite seu voto: ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 0:
                
                    break;
                default:
                    System.out.println("Voto inválido. Por favor, vote em 1, 2 ou 3.");
            }
        } while (voto != 0);

        System.out.println("\n=== Resultado da Votação ===");
        System.out.println("Candidato 1: " + votosCandidato1 + " voto(s)");
        System.out.println("Candidato 2: " + votosCandidato2 + " voto(s)");
        System.out.println("Candidato 3: " + votosCandidato3 + " voto(s)");

        
        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            System.out.println("Vencedor: Candidato 1");
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            System.out.println("Vencedor: Candidato 2");
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            System.out.println("Vencedor: Candidato 3");
        } else {
            System.out.println("Empate entre os candidatos.");
        }
    }
}