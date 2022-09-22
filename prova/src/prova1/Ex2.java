package prova1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner entrada =new Scanner(System.in);
		int n;
		float nd;

		System.out.println("Digite a quantidade de lados do polígono: ");
		n =entrada.nextInt();
		nd = n*(n-3)/2;
		System.out.println("A quantidade de diagonais diferentes é: "+ nd);

		entrada.close();
	}
}
