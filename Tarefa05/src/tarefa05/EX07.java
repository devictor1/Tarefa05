//Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

package tarefa05;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo! Por favor, insira um valor inteiro!");
		int valor1 = sc.nextInt();
		System.out.println("Maravilhoso! Agora, insira outro valor inteiro, diferente do anterior!");
		int valor2 = sc.nextInt();
		if (valor1 > valor2) {
			System.out.println("Os valores em ordem crescente são: " + valor2 + ", " + valor1);
		} else {
			System.out.println("Os valores em ordem crescente são: " + valor1 + ", " +  valor2);
		}
		sc.close();
	}


}


