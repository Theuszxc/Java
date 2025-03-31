import java.util.Scanner; // Corrected import statement

public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        
        System.out.println("Entre com a tabuada do 5: ");
        n = ler.nextInt(); // Read the user's input
        
        System.out.println("Tabuada do " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}