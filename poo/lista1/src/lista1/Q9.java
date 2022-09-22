
package lista1;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("valor do raio");
		double raio = entrada.nextDouble();

		System.out.printf("O Perimetro e: %.2f\n", ((2 * Math.PI) * raio));
		System.out.printf("Area: %f\n", Math.pow(Math.PI, 2));

	}

}
