/******************************************************************************

44 - Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um
algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
Carlos e André não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para
Carlos, R$33,00 para André e R$35,53 para Felipe.

*******************************************************************************/
import java.util.Scanner;
public class ex44
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
		
		System.out.println("Defina o valor da conta que Carlos, André e Felipe devem pagar: ");
		
		double valor = ler.nextDouble();
		
		int AndreeCarlos = (int) valor / 3;
		
		double felipe = valor - 2 * AndreeCarlos;
		
		System.out.println("Valor a pagar:\nAndré: "+ AndreeCarlos +"\nCarlos: "+ AndreeCarlos +"\nFelipe: "+ felipe);
	
		
	}
}