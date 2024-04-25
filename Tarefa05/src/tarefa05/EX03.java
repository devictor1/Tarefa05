/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia,
 * e R$ 1,00 se foremcompradas pelo menos 12. Escreva um programa que
 * leia o número de maçãs compradas, calcule e escreva o custo total da compra.
 */

package tarefa05;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float valor;
		System.out.println("Seja bem-vindo! Quantas maçãs o senhor deseja?");
		int macas = sc.nextInt();
		if (macas < 12) {
			valor = 1.30f;
			System.out.println("O valor total da sua compra ficará " + macas * valor + " reais!");
		} else {
			valor = 1;
			System.out.println("O valor total da sua compra ficará " + macas * valor + " reais!");
		}
		sc.close();
	}

}
