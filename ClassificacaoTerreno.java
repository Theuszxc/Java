import java.util.Scanner;

public class ClassificacaoTerreno {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar a largura do terreno
        System.out.print("Digite a largura do terreno (em metros): ");
        double largura = scanner.nextDouble();
        
        // Solicitar o comprimento do terreno
        System.out.print("Digite o comprimento do terreno (em metros): ");
        double comprimento = scanner.nextDouble();
        
        // Calcular a área do terreno
        double area = largura * comprimento;
        
        // Mostrar a área
        System.out.println("A área do terreno é: " + area + " m²");
        
        // Classificação do terreno de acordo com a área
        if (area < 100) {
            System.out.println("Classificação: TERRENO POPULAR");
        } else if (area >= 100 && area <= 500) {
            System.out.println("Classificação: TERRENO MASTER");
        } else {
            System.out.println("Classificação: TERRENO VIP");
        }
    }
}