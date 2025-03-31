import java.util.Scanner;

public class InformacoesPessoas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        int countIdade50Peso60 = 0;
        int countAlturaMenor150 = 0;
        int sumIdadeAlturaMenor150 = 0;
        int countOlhosAzuis = 0;
        int countRuivasSemOlhosAzuis = 0;

        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Pessoa " + i + ":");

            
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o peso (em kg): ");
            double peso = scanner.nextDouble();
            System.out.print("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();

          
            System.out.print("Digite a cor dos olhos (A - Azul, P - Preto, V - Verde, C - Castanho): ");
            char corOlhos = scanner.next().toUpperCase().charAt(0);
            System.out.print("Digite a cor dos cabelos (P - Preto, C - Castanho, L - Louro, R - Ruivo): ");
            char corCabelos = scanner.next().toUpperCase().charAt(0);

            
            if (idade > 50 && peso < 60) {
                countIdade50Peso60++;
            }

           
            if (altura < 1.50) {
                countAlturaMenor150++;
                sumIdadeAlturaMenor150 += idade;
            }

            
            if (corOlhos == 'A') {
                countOlhosAzuis++;
            }

            
            if (corCabelos == 'R' && corOlhos != 'A') {
                countRuivasSemOlhosAzuis++;
            }
        }

        
        System.out.println("\nResultados:");
        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg: " + countIdade50Peso60);
        
        
        if (countAlturaMenor150 > 0) {
            double mediaIdade = (double) sumIdadeAlturaMenor150 / countAlturaMenor150;
            System.out.println("Média das idades das pessoas com altura inferior a 1,50m: " + mediaIdade);
        } else {
            System.out.println("Não há pessoas com altura inferior a 1,50m.");
        }
        
        
        double porcentagemOlhosAzuis = (double) countOlhosAzuis / 20 * 100;
        System.out.println("Porcentagem de pessoas com olhos azuis: " + porcentagemOlhosAzuis + "%");

        
        System.out.println("Quantidade de pessoas ruivas que não possuem olhos azuis: " + countRuivasSemOlhosAzuis);
    }
}