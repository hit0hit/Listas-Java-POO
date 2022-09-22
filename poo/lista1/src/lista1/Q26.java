package lista1;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		int vetor[] = new int[5];
		Scanner entrada = new Scanner(System.in);

		int i = 0, p = 0;

		do {

			System.out.println("digiteum numero" + p);
			i = entrada.nextInt();

			if (i == vetor[0]) {
				System.out.println("numero repetido");
				p--;
			}

			if (i == vetor[1]) {
				System.out.println("numero repetido");
				p--;
			}

			if (i == vetor[2]) {
				System.out.println("numero repetido");
				p--;
			}

			if (i == vetor[3]) {
				System.out.println("numero repetido");
				p--;
			}

			if (i == vetor[4]) {
				System.out.println("numero repetido");
				p--;
			} else {

				vetor[p] = i;
			}

			p++;
		} while (p != 5);
		for (int f = 0; f < 5; f++) {
			System.out.println("o vetor==> " + vetor[f]);
		}

	}

}
