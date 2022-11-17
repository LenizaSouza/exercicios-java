package exercicios.treinamento;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {

		String nomeProduto;
		float precoCusto;
		float precoVenda;

		float totalCusto = 0.0f;
		float totalVenda = 0.0f;

		Scanner leitorScanner = new Scanner(System.in);

		int i = 0;
		for (; i < 3; i++) {

			System.out.println("Digite o nome do produto");
			nomeProduto = leitorScanner.nextLine();

			System.out.println("Digite o preco de custo do produto");
			precoCusto = leitorScanner.nextFloat();

			System.out.println("Digite o preco de venda do produto");
			precoVenda = leitorScanner.nextFloat();

			leitorScanner.nextLine();

			totalCusto = totalCusto + precoCusto;
			totalVenda = totalVenda + precoVenda;

			if (precoCusto == precoVenda) {
				System.out.println("Houve um empate entre o preco de custo e de venda");
			} else {
				if (precoCusto > precoVenda) {
					System.out.println("Prejuizo");
				} else {
					System.out.println("Lucro");
				}
			}

			System.out.println(nomeProduto + ", preco de custo = " + precoCusto + ", preco de venda = " + precoVenda);
		}
		System.out.println("A media do preco de custo é de : " + (totalCusto / i));
		System.out.println("A media do preco de venda é de : " + (totalVenda / i));
	}
}