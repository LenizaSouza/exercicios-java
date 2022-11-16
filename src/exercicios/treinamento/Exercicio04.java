package exercicios.treinamento;

import java.util.Scanner;

/* Exercício 04
 *4- Faça um programa que verifique (usando if e else) se uma letra digitada é vogal ou consoante.
 *  
 * */
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		char letra = leitor.next().charAt(0);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E'
				|| letra == 'I' || letra == 'O' || letra == 'U')
			System.out.println("A letra é Vogal");
		else
			System.out.println("A letra é Consoante");

	}
}
