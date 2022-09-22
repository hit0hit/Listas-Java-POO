package lista1;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Valor de X");
		double x = entrada.nextInt();
		System.out.println("Valor de Y");
		double y = entrada.nextInt();

		double resl = 2 * (Math.sqrt(3 * x + 30) / 3) + Math.pow(y - 34, 4);
		System.out.println("A equação e :" +resl);

	}

}
