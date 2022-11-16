package exercicios.treinamento;

import java.util.Scanner;

/* Exercício 02
 * Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo 
 *  
 * */

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número: ");
		numero = leitor.nextInt();

		if (numero >= 0)
			System.out.println("O numero é positivo ");
		else
			System.out.println("O numero é negativo ");

	}

}
