/*Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
 * Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até
 * R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.
 */

package tarefa05;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo! Qual é o seu salário fixo como vendedor?");
		float salarioFixo = sc.nextFloat();
		System.out.println("Perfeito! E qual o valor total das vendas desse mês?");
		float vendas = sc.nextFloat();
		float comissao = vendas * 3 / 100;
		if (vendas > 1500) {
			float vendasExtra = vendas - 1500;
			float comissaoExtra = vendasExtra * 5 / 100;
			float salarioTotal = salarioFixo + comissao + comissaoExtra;
			System.out.println("Incrível! Seu salário no total é de R$" + salarioTotal);
		} else {
			float salarioTotal = salarioFixo + comissao;
			System.out.println("Incrível! Seu salário no total é de R$" + salarioTotal);
		}
		sc.close();

	}

}
