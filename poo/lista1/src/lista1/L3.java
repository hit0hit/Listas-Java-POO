package lista1;

import java.util.Scanner;

public class L3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("qual e o valor da sua compra");
		int valor = entrada.nextInt();
		
		if(valor < 10) {
			int lucro = 70*valor/100;
			System.out.println("seu lucro de 70% e de ==>"+ lucro);
		}if(valor <= 10 && valor < 30) {
			int lucro = 50*valor/100;
			System.out.println("seu lucro de 50% e de ==>"+ lucro);
		}if(valor <= 30 && valor < 50) {
			int lucro = 40*valor/100;
			System.out.println("seu lucro de 40% e de ==>"+ lucro);
		}if(valor >=50) {
			int lucro = 30*valor/100;
			System.out.println("seu lucro de 30% e de ==>"+ lucro);
		}
		
		

	}

}
