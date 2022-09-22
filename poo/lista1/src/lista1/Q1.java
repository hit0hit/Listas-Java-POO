package lista1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nome do Marido :");
		String nome1 = entrada.next();
		System.out.println("Sobrenome do Marido :");
		String sobrenome1 = entrada.next();
		System.out.println("Nome da Esposa :");
		String nome2 = entrada.next();
		System.out.println("Sobrenome da Esposa :");
		String sobrenome2 = entrada.next();
		
		int valor1 = 2022;
		int valor2 = 2018;
		int anos_casados = valor1 - valor2;
		
		System.out.println("O Senhor " + nome1 + sobrenome1 + " e casado com a " + nome2 + sobrenome2 + " a " + anos_casados + " anos");
	}

}
