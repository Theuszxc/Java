/******************************************************************************

ex.10

*******************************************************************************/
import java.util.Scanner;
public class GasolinaOuAlcool
{
	public static void main(String[] args) {
	    Double QT, A, G, TG, valorAlcool, valorGasolina;
	    Scanner ler = new Scanner (System.in);
		System.out.println("Por favor, informe o tipo de carro: ");
		String TC = ler.nextLine();
		System.out.println("Por favor, Informe quantos litros deseja: ");
		QT = ler.nextDouble();
		System.out.println("Por favor, Informe qual tipo de gasolina deseja \n 1) Alcool R$ 1,00 litro \n 2) Gasolina R$ 1.80 litro \n selecione : ");
		TG = ler.nextDouble();
		valorAlcool = QT * 1;
		valorGasolina = QT * 1.80;
		if(TG == 1){
		 System.out.println("O valor gasto para encher totalmente seu tanque é de: "+ valorAlcool);
		}
		 else if (TG == 2){ 
		   System.out.println("O valor gasto para encher totalmente seu tanque é de: "+ valorGasolina);
		   }
		   else 
		   System.out.println("Opção invalida!");
		
	}
}
