package lista1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("numero inteiro:");
		int a = entrada.nextInt();
		System.out.println("numero inteiro:");
		int b = entrada.nextInt();

		System.out.println("O dividendo e: " + a);
		System.out.println("O divisor e: " + b);
		
		int quociente, resto;
		
		quociente = a / b;
		System.out.println("O quociente e " +quociente);
		
		resto = a % b;
		System.out.println("O resto e " + resto);
	}

}
