package exercicios.treinamento;

import java.util.Scanner;

/* Exercício 11
 * As organizações CSM resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.  
a. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual;
b. Salários até R$ 280,00 (incluindo): aumento de 20%;
c. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
d. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
e. Salários de R$ 1500,00 em diante: aumento de 5%
Após o aumento ser realizado; informe na tela;

a. O salário antes do reajuste;
b. O percentual de aumento aplicado;
c. O valor do aumento;
d. O novo salário, após o aumento.
 *  
 * */
public class Exercicio11 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		float salario, resultado;

		System.out.println("Digite o salario do colaborador: ");
		salario = leitor.nextFloat();

		if (salario <= 280) {
			resultado = (salario * 20) / 100;
			System.out
					.println("o salario é R$ " + salario + ", o percentual de aumento é de 20% e o aumento será de R$ "
							+ resultado + " o salario com o reajuste será de R$ " + (salario + resultado));
		} else if (salario <= 700) {
			resultado = (salario * 15) / 100;
			System.out
					.println("o salario é R$ " + salario + ", o percentual de aumento é de 15% e o aumento será de R$ "
							+ resultado + " o salario com o reajuste será de R$ " + (salario + resultado));
		} else if (salario <= 1500) {
			resultado = (salario * 10) / 100;
			System.out
					.println("o salario R$ é " + salario + ", o percentual de aumento é de 10% e o aumento será de R$ "
							+ resultado + " o salario com o reajuste será de R$ " + (salario + resultado));
		} else {
			resultado = (salario * 5) / 100;
			System.out.println("o salario R$ é " + salario + ", o percentual de aumento é de 5% e o aumento será de R$ "
					+ resultado + " o salario com o reajuste será de R$ " + (salario + resultado));
		} 

	}

}
