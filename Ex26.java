import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int N = scanner.nextInt();
        
        int numero = 0;

        while (numero <= N) {
            System.out.println(numero);
            numero++;
        }
    }
}
