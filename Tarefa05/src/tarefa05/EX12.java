/* Faça um algoritmo para ler: quantidade atual em estoque, quantidade
 * máxima em estoque e quantidade mínima em estoque de um produto. Calcular
 * e escrever a quantidade média ((quantidademédia = quantidade máxima + quantidade mínima)/2).
 * Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem
 * 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.
 */

package tarefa05;

import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo! Por favor digite a quantidade atual em estoque do produto escolhido!");
		int estoqueAtual = sc.nextInt();
		System.out.println("Perfeito, e qual a quantidade máxima que pode chegar?");
		int estoqueMaximo = sc.nextInt();
		System.out.println("Obrigado, qual a quantidade mínima possível?");
		int estoqueMinimo = sc.nextInt();
		int estoqueMedio = (estoqueMaximo + estoqueMinimo)/2;
		if (estoqueAtual >= estoqueMedio) {
			System.out.println("O estoque atual ultrapassa o volume médio disponível, não efetuar compra");
		} else {
			System.out.println("O estoque atual não ultrapassa o volume médio disponível, efetuar compra");
		}	
		
		sc.close();
	}

}
