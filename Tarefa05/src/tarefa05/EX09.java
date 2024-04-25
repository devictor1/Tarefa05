/* A jornada de trabalho semanal de um funcionário é de 40 horas.
 * O funcionário que trabalhar mais de 40 horas receberá hora extra,
 * cujo cálculo é o valor da hora regular com um acréscimo de 50%.
 * Escreva um algoritmo que leia o número de horas trabalhadas em um mês,
 * o salário por hora e escreva o salário total do funcionário, que
 * deverá ser acrescido das horas extras, caso tenham sido trabalhadas
 * (considere que o mês possua 4 semanas exatas).
 */

package tarefa05;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo! Quantas horas você trabalhou esse mês?");
		int horas = sc.nextInt();
		System.out.println("E quanto você ganha, por hora trabalhada?");
		float salario = sc.nextFloat();
		float salarioTotal = horas * salario;
		if (horas <= 160) {
			System.out.println("Maravilhoso! Seu salário esse mês vai ser de R$" + salarioTotal);
		} else {
			int horasExtras = horas - 160;
			float salarioExtra = (salario * horasExtras * 1.5f);
			System.out.println("Esse mês você trabalhou mais de 160 horas! Seu salário foi de R$" + salarioTotal+ " para R$" + (salarioTotal + salarioExtra));
		}
		sc.close();
	}

}
