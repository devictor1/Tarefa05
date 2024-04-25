/*Ler a hora de início e a hora de fim de um jogo de Xadrez
 * (considere apenas horas inteiras, sem os minutos) e calcule
 * a duração do jogo em horas, sabendo-se que o tempo máximo de
 * duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
 */

package tarefa05;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo! A que horas o seu jogo começou? Escreva apenas a hora, sem minutos");
		int horaInicial = sc.nextInt();
		System.out.println("Perfeito! E que horas o jogo terminou?");
		int horaFinal = sc.nextInt();
		int tempoTotal;
		if (horaFinal > horaInicial) {
			tempoTotal = horaFinal - horaInicial;
			System.out.println("O seu jogo durou " + tempoTotal + " horas!!");
		}else {
			tempoTotal = horaFinal - horaInicial + 24;
			System.out.println("O seu jogo durou um total de " + tempoTotal + " horas!!");
		}
sc.close();
	}

}
