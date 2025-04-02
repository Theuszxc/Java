import java.util.Scanner;

public class SistemaDeLogin {
    public static void main(String[] args) {
        
        String usuarioCorreto = "usuario123";
        String senhaCorreta = "senha123";

        
        Scanner scanner = new Scanner(System.in);

        int tentativas = 0;
        boolean loginBemSucedido = false;

        
        while (tentativas < 3) {
           
            System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            
            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                loginBemSucedido = true;
                break;
            } else {
                tentativas++;
                System.out.println("Nome de usuário ou senha incorretos. Tentativas restantes: " + (3 - tentativas));
            }
        }

        
        if (loginBemSucedido) {
            System.out.println("Login bem-sucedido! Bem-vindo à sua conta corrente.");
        } else {
            System.out.println("Número máximo de tentativas atingido. Acesso negado.");
        }
    }
}