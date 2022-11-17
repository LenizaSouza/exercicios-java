package exercicios.treinamento;

import java.util.Scanner;

/* Exercício 10
 * Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-vespertino ou N-noturno. Imprima a mensagem “Bom dia!” ou  “Boa Noite” ou “Valor inválido”, conforme o caso..
 *  
 * */
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o seu turno, sendo M-matutino ou V-vespertino ou N-noturno: ");
		char turno = leitor.next().charAt(0);

		if (turno == 'M') {
			System.out.println("Bom dia! ");
		} else {
			if (turno == 'V') {
				System.out.println("Bom tarde! ");
			} else {
				if (turno == 'N') {
					System.out.println("Boa noite! ");
				} else {
					System.out.println("Valor Invalido");
				}

			}

		}

	}
}
