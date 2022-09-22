package lista1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("coloque o primeiro termo:");
		int ai = entrada.nextInt();
		System.out.println("coloque o segundo termo:");
		int n = entrada.nextInt();
		System.out.println("coloque o terceiro termo:");
		int r = entrada.nextInt();

		int an = ai + (n - 1) * r;
		System.out.println("valor da an e: " + an);

	}

}
