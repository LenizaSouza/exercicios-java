package exercicios.treinamento;

import java.util.Scanner;

/* Exercício 01
 * Faça um programa que peça dois números e verifique (usando if e else) e imprima o maior deles.
 *  
 * */

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero1;
		int numero2;
		System.out.println("Digite um numero");
		numero1 = leitor.nextInt();
		System.out.println("Digite outro numero");
		numero2 = leitor.nextInt();



        if (numero1 > numero2) {
            System.out.println("O maior numero é o " + numero1);
        } else {
            System.out.println("O maior numero é o " + numero2);
        }

	}

}
