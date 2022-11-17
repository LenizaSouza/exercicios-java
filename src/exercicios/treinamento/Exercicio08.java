package exercicios.treinamento;

import java.util.Scanner;

/* Exercício 08
 * Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre o mais barato.
 *  
 * */
public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int batata, leite, refrigerante;

		System.out.println("Digite o preco da batata: ");
		batata = leitor.nextInt();
		System.out.println("Digite o preco do leite: ");
		leite = leitor.nextInt();
		System.out.println("Digite o preco do refrigerante: ");
		refrigerante = leitor.nextInt();

		if (batata < leite && batata < refrigerante) {
			System.out.println("Compre a batata porque está mais barata que os demais itens ");
		} else if (leite < refrigerante && leite < batata) {
			System.out.println("Compre o leite porque está mais barata que os demais itens ");
		} else if (refrigerante < leite && refrigerante < batata) {
			System.out.println("Compre o refrigerante porque está mais barata que os demais itens ");
		} else
			System.out.println("os precos são iguais");

	}

}
