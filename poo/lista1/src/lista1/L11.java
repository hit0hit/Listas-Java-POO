package lista1;

import java.util.Scanner;

public class L11 {

	public static void main(String[] args) {
		{

	        int numero = 0, comeco, fim;
	        Scanner entrada = new Scanner(System.in);

	        System.out.println("Entre com um número: ");
	        numero = entrada.nextInt();
	        System.out.println("Entre com o começo : ");
	        comeco = entrada.nextInt();
	        System.out.println("Entre com fim : ");
	        fim = entrada.nextInt();

	        for (int i = 0; i < fim; i++) {
	            if (i > comeco && i < fim) {
	                if (i % numero == 0) {
	                    System.out.println("numero:" +i);
	                }
	            }
	        }

	    }
	}

}
