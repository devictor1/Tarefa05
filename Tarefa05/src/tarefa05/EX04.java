/*Ler as notas da 1a. e 2a. avaliações de um aluno.
 * Calcular a média aritmética simples e escrever uma mensagem que
 * diga se o aluno foi ou não aprovado (considerar que nota igual ou
 * maior que 6 o aluno é aprovado). Escrever também a média calculada.
 */

package tarefa05;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Seja bem-vindo! Por favor, escreva a nota da sua primeira avaliação, com uma virgula \",\" para decimais");
		float nota1 = sc.nextFloat();
//Professor, não sei o motivo, mas quando eu utilizo ponto na resposta, da erro, mas quando uso vírgula funciona,
//então deixei explícito que é para utilizar vírgula, mas quando da sysout a resposta sai com um ponto, não entendi.
		System.out.println("Perfeito, agora insira a sua segunda nota!");
		float nota2 = sc.nextFloat();
		float media = (nota1 + nota2) / 2;
		if (media < 6) {
			System.out.println("Poxa, sua nota " + media + " infelizmente não é suficiente :(");
		} else {
			System.out.println("Maravilhoso! Sua nota " + media + " é suficiente para você ser aprovado(a)!");
		}
		sc.close();
	}

}
