package exercicios.treinamento;

import java.util.Scanner;

/* Exercício 03
 * Faça um programa que verifique (usando if e else) se uma letra digitada é “F” ou “M”.
 * Conforme a letra escrever: F – Feminino, M- Masculino, Sexo inválido.   
 *  
 * */

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite F ou M para o genero: ");
		char genero = leitor.next().charAt(0);

		if (genero == 'F' || genero == 'f') {
			System.out.println("Feminino");
		} else {
			if (genero == 'M' || genero == 'm') {
				System.out.println("Masculino");
			} else {
				System.out.println("Sexo Invalido");
			}

		}
	}
}
