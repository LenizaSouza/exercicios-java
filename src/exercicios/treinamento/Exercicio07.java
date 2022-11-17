package exercicios.treinamento;

import java.util.Scanner;

/* Exercício 07
 * Faça um programa que leia três números, verifique (usando if e else) e mostre o maior e o menor deles;
 *  
 * */
public class Exercicio07 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int numero1, numero2, numero3;

		System.out.println("Digite o primeiro numero: ");
		numero1 = leitor.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2 = leitor.nextInt();
		System.out.println("Digite o terceiro numero: ");
		numero3 = leitor.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("o maior numero é o " + numero1);
		} else if (numero2 > numero3 && numero2 > numero1) {
			System.out.println("o maior numero é o " + numero2);
		} else if (numero3 > numero2 && numero3 > numero1) {
			System.out.println("o maior numero é o " + numero3);
		} else
			System.out.println("os números são iguais");
		
		if (numero1 < numero2 && numero1 < numero3) {
			System.out.println("o menor numero é o " + numero1);
		} else if (numero2 < numero3 && numero2 < numero1) {
			System.out.println("o menor numero é o " + numero2);
		} else if (numero3 < numero2 && numero3 < numero1) {
			System.out.println("o menor numero é o " + numero3);
		} 

	}
}