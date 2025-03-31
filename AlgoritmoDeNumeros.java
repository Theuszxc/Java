import java.util.Scanner;

public class AlgoritmoDeNumeros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        int contagem0_100 = 0;
        int contagem101_200 = 0;
        int contagemMaior200 = 0;
        
      
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            
            
            if (numero >= 0 && numero <= 100) {
                contagem0_100++;
            } else if (numero >= 101 && numero <= 200) {
                contagem101_200++;
            } else if (numero > 200) {
                contagemMaior200++;
            }
        }
        
        System.out.println("Quantidade de números entre 0 e 100: " + contagem0_100);
        System.out.println("Quantidade de números entre 101 e 200: " + contagem101_200);
        System.out.println("Quantidade de números maiores que 200: " + contagemMaior200);

    }
}