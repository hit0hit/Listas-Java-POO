package lista1;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);

		    int i, opcao=1;
		    float vetor[]=new float[10];
 
		    for(i = 0; i < 10; i++){
		    	System.out.println("Digite o valor da posicao : "+ i);
		      vetor[i] = entrada.nextFloat();
		    }

		    do{
		    	System.out.println("\n0 - Fizalizar\n1 - Imprimir vetor\n2 - Imp. vetor invertido\n");
		       opcao=entrada.nextInt();

		        switch(opcao){
		        case 0:
		        	System.out.println("");
		            break;
		        case 1:
		            for(i = 0; i < 10; i++){
		            	System.out.println(""+ vetor[i]);
		            }
		            System.out.println("\n");
		            break;
		        case 2:
		            for(i = 9; i >= 0; i--){
		            	System.out.println(""+ vetor[i]);
		            }
		           System.out.println("\n");
		            break;
		        default:
		            System.out.println("Opcao invaalida!\n");
		        }

		    }while(opcao != 0);

		    
		}

	}


