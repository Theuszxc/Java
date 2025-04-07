/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int soma = 0;
	    int numero = 1;
	    
	    while (numero <= 10) {
	       soma += numero;
	    numero ++; 
	    }
	    
	    
		System.out.println("A soma dos números de 1 a 10 é: " + soma);
	}
}