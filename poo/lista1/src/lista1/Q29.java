package lista1;

import java.util.Random;
import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {
	int[] vetor = new int[1000];
	int limInferior, limSuperior;
	int coluna = 0;
	Scanner entrada = new Scanner(System.in);
	boolean checarNum = false;
	do {
		System.out.println("Digite um valor inicial do sorteio de números: ");
		limInferior = entrada.nextInt();
		System.out.println("Digite um número para ser o número máximo para o sorteio: ");
		limSuperior = entrada.nextInt();
		
		if (limInferior > limSuperior || (limSuperior - limInferior) < 1000) {
			checarNum = true;
			System.out.println("Digite um valor válido.");
		} 
		else {
			checarNum = false;
		}
	} 
	while (checarNum);
	
	for (int cont = 0; cont < vetor.length; cont++) {
		vetor[cont] = sorteia(limInferior, limSuperior);
		
		for (int cont2 = 0; cont2 < vetor.length; cont2++) {
			
			if (cont != cont2) {
				
				if (vetor[cont] == vetor[cont2]) {
					cont--;
				}
			}
		}
	}

	for (int cont = 0; cont < vetor.length; cont++) {
		System.out.printf("[%d]\t", vetor[cont]);
		coluna++;
		
		if (coluna == 10) {
			System.out.println("");
			coluna = 0;
		}
	}
}

static int sorteia(int limiteInferior, int limiteSuperior) {
	Random rd = new Random();
	return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
}

}
