/*Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
 * Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
 * Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo',
 * senão escrever a mensagem 'Saldo Negativo'.
 */
package tarefa05;

import java.util.Scanner;

public class EX11 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo! Por favor, digite o número da sua conta abaixo!");
		int conta = sc.nextInt();
		System.out.println("Obrigado! Qual o seu saldo atual?");
		float saldoInicial = sc.nextFloat();
		System.out.println("Perfeito! E quanto você deseja debitar da sua conta?");
		float debito = sc.nextFloat();
		System.out.println("Entendido! E qual o valor que você irá creditar na conta?");
		float credito = sc.nextFloat();
		float saldoAtual = saldoInicial - debito + credito;
		System.out.print("Obrigado! Com as transações feitas agora, o saldo da conta "
				+ conta + " foi de R$" + saldoInicial + " para R$" + saldoAtual);
		if (saldoAtual < 0) {
			System.out.print(", e infelizmente seu saldo é negativo :(");
		} else {
			System.out.print(", e seu saldo é positivo!");
		}
		
		
		
		
		
		
		sc.close();
	}
}
