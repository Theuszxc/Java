import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int somaIdades = 0;
        int maioresDeIdade = 0;
        int numeroDePessoas = 20;

      
        for (int i = 1; i <= numeroDePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            
            
            somaIdades += idade;

     
            if (idade >= 18) {
                maioresDeIdade++;
            }
        }

        
        double mediaIdades = (double) somaIdades / numeroDePessoas;

  
        System.out.println("Soma das idades: " + somaIdades);
        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Número de pessoas maiores de idade: " + maioresDeIdade);
    }
}