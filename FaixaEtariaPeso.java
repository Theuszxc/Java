import java.util.Scanner;

public class FaixaEtariaPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int somaPeso1a10 = 0, somaPeso11a20 = 0, somaPeso21a30 = 0, somaPesoAcima31 = 0;
        int cont1a10 = 0, cont11a20 = 0, cont21a30 = 0, contAcima31 = 0;

        
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();

            System.out.println("Digite o peso da pessoa " + (i + 1) + ": ");
            double peso = scanner.nextDouble();

            
            if (idade >= 1 && idade <= 10) {
                somaPeso1a10 += peso;
                cont1a10++;
            } else if (idade >= 11 && idade <= 20) {
                somaPeso11a20 += peso;
                cont11a20++;
            } else if (idade >= 21 && idade <= 30) {
                somaPeso21a30 += peso;
                cont21a30++;
            } else if (idade > 30) {
                somaPesoAcima31 += peso;
                contAcima31++;
            }
        }

        
        if (cont1a10 > 0) {
            System.out.println("Média de peso da faixa de 1 a 10 anos: " + (somaPeso1a10 / cont1a10));
        } else {
            System.out.println("Nenhuma pessoa na faixa de 1 a 10 anos.");
        }

        if (cont11a20 > 0) {
            System.out.println("Média de peso da faixa de 11 a 20 anos: " + (somaPeso11a20 / cont11a20));
        } else {
            System.out.println("Nenhuma pessoa na faixa de 11 a 20 anos.");
        }

        if (cont21a30 > 0) {
            System.out.println("Média de peso da faixa de 21 a 30 anos: " + (somaPeso21a30 / cont21a30));
        } else {
            System.out.println("Nenhuma pessoa na faixa de 21 a 30 anos.");
        }

        if (contAcima31 > 0) {
            System.out.println("Média de peso da faixa acima de 31 anos: " + (somaPesoAcima31 / contAcima31));
        } else {
            System.out.println("Nenhuma pessoa na faixa acima de 31 anos.");
        }
    }
}