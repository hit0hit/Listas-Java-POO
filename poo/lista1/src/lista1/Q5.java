package lista1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("coloque o valor original do produto: ");
		double valor = entrada.nextDouble();
		System.out.println("coloque o desconto: ");
		double desconto = entrada.nextDouble();
		desconto = desconto / 100;
		double valor_final = valor - (desconto * valor);

		System.out.println("valor final do produto: " + valor_final);

	}

}
