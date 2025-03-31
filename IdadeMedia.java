import java.util.Scanner;

public class IdadeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int totalIdadeGrupo = 0;
        int totalIdadeMulheres = 0;
        int totalIdadeHomens = 0;
        int qtdMulheres = 0;
        int qtdHomens = 0;

        
        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            System.out.print("Digite o sexo (M para masculino ou F para feminino) da pessoa " + i + ": ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            
            totalIdadeGrupo += idade;

            
            if (sexo == 'F') {
                totalIdadeMulheres += idade;
                qtdMulheres++;
            } else if (sexo == 'M') {
                totalIdadeHomens += idade;
                qtdHomens++;
            } else {
                System.out.println("Sexo inválido, digite apenas 'M' para masculino ou 'F' para feminino.");
                i--; 
            }
        }

       
        double mediaGrupo = totalIdadeGrupo / 7.0;
        double mediaMulheres = (qtdMulheres > 0) ? totalIdadeMulheres / (double) qtdMulheres : 0;
        double mediaHomens = (qtdHomens > 0) ? totalIdadeHomens / (double) qtdHomens : 0;

       
        System.out.printf("\nIdade média do grupo: %.2f\n", mediaGrupo);
        System.out.printf("Idade média das mulheres: %.2f\n", mediaMulheres);
        System.out.printf("Idade média dos homens: %.2f\n", mediaHomens);
    }
}