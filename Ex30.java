import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.print("Digite o número para ver a tabuada: ");
        n = ler.nextInt();

        int i = 1;
        System.out.println("Tabuada do " + n + ":");

        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
    }
}