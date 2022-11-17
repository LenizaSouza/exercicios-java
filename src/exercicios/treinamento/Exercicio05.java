package exercicios.treinamento;

import java.util.Scanner;

/* Exercício 05
 * Faça um programa para a leitura de duas notas parciais de um aluno.  
A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
A mensagem “Aprovado com Distinção”, se a média for igual a dez;
A mensagem “Reprovado” se a média for menor de do que sete; 
 *  
 * */
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int nota1;
		int nota2;
		int media;

		System.out.println("Digite a primeira nota: ");
		nota1 = leitor.nextInt();
		System.out.println("Digite a segunda nota: ");
		nota2 = leitor.nextInt();

		media = (nota1 + nota2) / 2;
		if (media >= 7) {
			if (media == 10)
				System.out.println("Aprovado com Distincao");
			else
				System.out.println("Aprovado ");
		} else {
			System.out.println("Reprovado");

		}
	}

}
