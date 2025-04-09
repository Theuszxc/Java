import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o nome do usuário: ");
        String nome = ler.nextLine();
        System.out.print("Informe a idade do usuário: ");
        
        int idade = ler.nextInt();
        int anosDeVida = idade;
        
        System.out.println(nome + " já viveu: " + anosDeVida + " anos.");
    }
}
