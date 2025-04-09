/*

O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
balança já desconte o peso do prato.

*/

import java.util.Scanner;
public class Ex41 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double precoPorQuilo = 12.00;
        
        System.out.println("Digite o peso do prato montado (Em quilos): ");
        double peso = ler.nextDouble();
        
        double valor = (peso - 1.00) * precoPorQuilo;
        
        System.out.println("Total a pagar: R$"+valor);
    }
}