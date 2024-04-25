// Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

package tarefa05;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo! Por favor, insira um valor inteiro!");
		int valor1 = sc.nextInt();
		System.out.println("Maravilhoso! Agora, insira outro valor inteiro, diferente do anterior!");
		int valor2 = sc.nextInt();
		if (valor1 > valor2) {
			System.out.println("O maior valor é o " + valor1);
		} else {
			System.out.println("O maior valor é o " + valor2);
		}
		sc.close();
	}

}
