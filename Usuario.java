import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println(nome);
        }
    }
}