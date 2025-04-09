import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o número de cavalos: ");
        
        int cavalos = ler.nextInt();
        int FerradurasPorCavalo = 4;
        int TotalDeFerraduras = cavalos * FerradurasPorCavalo;
        
        System.out.println("O número total de ferraduras é: " + TotalDeFerraduras);
    }
}