package lista1;

import java.util.Random;
import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
			
					Scanner entrada = new Scanner(System.in);
					boolean checandoVetor = false;
					int inicioRd, finalRd;
					int[] vetorA = new int[10];
					int[] vetorB = new int[vetorA.length];
					int[] vetorSoma = new int[vetorA.length];
					int[] vetorIntercecao = new int[vetorA.length];
					int[] vetorDiferenca = new int[vetorA.length];
					int[] vetorIntercalacao = new int[vetorA.length * 2];
					
					for (int cont = 0; cont < vetorA.length; cont++) {
						vetorSoma[cont] = 0;
						vetorIntercecao[cont] = 0;
						vetorDiferenca[cont] = 0;
						vetorIntercalacao[cont] = 0;
					}
			
					do {
						System.out.println("Digite de onde o sorteio de números vai começar no vetor 1.");
						inicioRd = entrada.nextInt();
						System.out.println("Digite onde o sorteio de números vai terminar no vetor 1");
						finalRd = entrada.nextInt();
						
						if (inicioRd > finalRd) {
							checandoVetor = true;
							System.out.println("Digite um valor válido.");
						} 
						else {
							checandoVetor = false;
						}
					} 
					while (checandoVetor);

		
					do {
						System.out.println("Digite de onde o sorteio de números vai começar no vetor 2.");
						inicioRd = entrada.nextInt();
						System.out.println("Digite onde o sorteio de números vai terminar no vetor 2");
						finalRd = entrada.nextInt();
						
						if (inicioRd > finalRd) {
							checandoVetor = true;
							System.out.println("Digite um valor válido.");
						}
							else {
							checandoVetor = false;
						}
					} while (checandoVetor);

					System.out.printf("VetorA:\t\t\t");
					
					for (int cont = 0; cont < vetorA.length; cont++) {
						vetorA[cont] = sorteia(inicioRd, finalRd);
						
						if (cont == vetorA.length - 1) {
							System.out.printf("[%d]\n", vetorA[cont]);
						} 
						else {
							System.out.printf("[%d]\t", vetorA[cont]);
						}
					}
					System.out.printf("VetorB:\t\t\t");
					
					for (int cont = 0; cont < vetorA.length; cont++) {
						vetorB[cont] = sorteia(inicioRd, finalRd);
						
						if (cont == vetorA.length - 1) {
							System.out.printf("[%d]\n", vetorB[cont]);
						} 
						else {
							System.out.printf("[%d]\t", vetorB[cont]);
						}

					}
					System.out.printf("Vetor soma:\t\t");
					
					for (int cont = 0; cont < vetorA.length; cont++) {
						vetorSoma[cont] = vetorA[cont] + vetorB[cont];
						System.out.printf("[%d]\t", vetorSoma[cont]);
					}
					System.out.println("");
			
					int contadorInterseccao = 0;
					System.out.printf("Vetor intersecção:\t");
					
					for (int cont = 0; cont < vetorA.length; cont++) {
						
						for (int cont2 = 0; cont2 < vetorA.length; cont2++) {
							
							if (vetorA[cont] == vetorB[cont2]) {
								vetorIntercecao[contadorInterseccao] = vetorA[cont];
								contadorInterseccao++;
								break;
							}
						}
					}
					for (int cont = 0; cont < vetorA.length; cont++) {
						
						if (vetorIntercecao[cont] != 0) {
							System.out.printf("[%d]\t", vetorIntercecao[cont]);
						}

					}
					System.out.println("");
		
					int contDiferenca = 0;
					int contadorVetorDiferenca = 0;
					System.out.printf("Vetor Diferença:\t");
					
					for (int cont = 0; cont < vetorA.length; cont++) {
						
						for (int cont2 = 0; cont2 < vetorA.length; cont2++) {
							
							if (vetorA[cont] == vetorB[cont2]) {
								contDiferenca++;
							
							}
						}
						if (contDiferenca == 0) {
							vetorDiferenca[contadorVetorDiferenca] = vetorA[cont];
							contadorVetorDiferenca++;
						}
						contDiferenca = 0;
					}
					for (int cont = 0; cont < vetorA.length; cont++) {
						
						if (vetorDiferenca[cont] != 0) {
							System.out.printf("[%d]\t", vetorDiferenca[cont]);
						}

					}
					System.out.println("");
			
					
					System.out.printf("Vetor intercalação:\t");
					int contadorIntercalacaoPar = 0;
					int contadorIntercalacaoImpar = 1;
					
					for (int cont = 0; cont < vetorA.length; cont++) {
						vetorIntercalacao[contadorIntercalacaoPar] = vetorA[cont];
						vetorIntercalacao[contadorIntercalacaoImpar] = vetorB[cont];
						contadorIntercalacaoPar += 2;
						contadorIntercalacaoImpar += 2;
					}
					for (int cont = 0; cont < vetorIntercalacao.length; cont++) {
						System.out.printf("[%d]\t", vetorIntercalacao[cont]);
					}
					System.out.println("");
				}

				static int sorteia(int limiteInferior, int limiteSuperior) {
					Random rd = new Random();
					return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
				}
	

	}


