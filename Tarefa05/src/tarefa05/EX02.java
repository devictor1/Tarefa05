/*Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
*/
package tarefa05;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo! Por favor, insira um valor inteiro!");
		int valor = sc.nextInt();
		if (valor >= 0) {
			System.out.println("O valor inserido é positivo!");
		} else {
			System.out.println("O valor inserido é negativo!");
		}
		sc.close();
	}
}
