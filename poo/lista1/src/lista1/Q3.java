package lista1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = entrada.next();
		System.out.println("Qual sua idade?");
		int idade = entrada.nextInt();
		
		int dia = idade * 365;
		System.out.println("seu nome" +nome+ "A idade em dias> " +dia +" dias");
		
		

	}

}
