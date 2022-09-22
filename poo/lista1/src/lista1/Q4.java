package lista1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("coloque a temperatura em gruas Celsius:");
		double c = entrada.nextInt();
		
		double f = (c * 1.8)+32;
		System.out.println("A conversão de " +c+ " graus Celsius e " +f+ " graus Fahrenheit");
		
	}

}
