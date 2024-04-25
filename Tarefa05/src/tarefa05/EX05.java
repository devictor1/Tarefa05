/*Ler o ano atual e o ano de nascimento de uma pessoa.
 * Escrever uma mensagem que diga se ela poderá ou não
 * votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
 */

package tarefa05;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo! Em que ano estamos?");
		int anoAtual = sc.nextInt();
		System.out.println("Maravilhoso! E em qual ano você nasceu?");
		int anoNascimento = sc.nextInt();
		int idade = anoAtual - anoNascimento;
		if (idade < 18) {
			System.out.println("Você não pode votar ainda!");
		} else {
			System.out.println("Você já está apto para votar!");
		}
		sc.close();
	}

}
