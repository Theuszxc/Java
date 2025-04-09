/******************************************************************************

atividade 43

*******************************************************************************/
import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         double salario, aumento, imposto, salario1, salario2;

          System.out.println("Insira o valor do salário do funcionário: R$");
            salario = ler.nextDouble();
            
              aumento = salario*15/100;
              salario1 = aumento + salario;
              imposto = salario1*8/100;
              salario2 = salario1-imposto;
                
          System.out.println("\n Seu salário inicial: R$" + salario + "\n Aumento de 15%: R$" +aumento + "\n Salário com o aumento: R$" + salario1 + "\n Imposto cobrado de 8%: R$" + imposto + "\n Salario com imposto descontado: R$" + salario2);
    } 
}