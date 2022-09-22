package lista1;

import java.util.Scanner;

public class Q28 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		int p;
		System.out.println("Digite o valor de N: ");
		n = entrada.nextInt();
		System.out.println("Digite o valor de P: ");
		p = entrada.nextInt();
		System.out.printf("Resultado de Apn = %d \n", apn(n, p));
		System.out.printf("Resultado de Cpn = %d \n", cpn(n, p));
	}

	static int apn(int n, int p) {
		int result = fat(n) / fat(n - p);
		return result;
	}

	static int cpn(int n, int p) {
		int result = fat(n) / fat(p) * (fat(n - p));
		return result;
	}

	static int fat(int numero) {
		int parametro = numero;
		
		for (int cont = 0; cont < numero; cont++) {
			parametro = parametro * (numero - cont);
		}
		return parametro;
	}
}
