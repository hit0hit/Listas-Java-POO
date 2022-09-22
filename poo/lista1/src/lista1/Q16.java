package lista1;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		
	        int numero;
	        Scanner entrada = new Scanner(System.in);
	        System.out.println("Informe o nuremo:");
	        numero = entrada.nextInt();
	        {
	            for (int i = 1; i <= numero; i++) {
	                if (primo(i))
	                    System.out.println(i + " é primo.");
	            }
	        }
	    }

	    private static boolean primo(int numero) {
	        for (int j = 2; j < numero; j++) {
	            if (numero % j == 0)
	                return false;
	        }
	        return true;
	    }
	}


