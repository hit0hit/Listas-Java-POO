package lista1;

import java.util.Scanner;

public class L6 {

	public static void main(String[] args) {

		{
	        Scanner entrada = new Scanner(System.in);
	        int numeroCodigo;
	        System.out.println("Informe o codigo do produto:");
	        numeroCodigo = entrada.nextInt();

	        switch (numeroCodigo) {
	        case 1:
	            System.out.println("Alimento n�o-perec�vel:");
	            break;
	        case 2:
	        case 3:
	        case 4:
	            System.out.println("Alimento Perec�vel: ");
	            break;
	        case 5:
	        case 6:
	            System.out.println("Vestu�rio");
	            break;
	        case 7:
	            System.out.println("Higiene Pessoal");
	            break;
	        case 8:
	        case 9:
	        case 10:
	        case 11:
	        case 12:
	        case 13:
	        case 14:
	        case 15:
	            System.out.println("Limpeza e utens�lios dom�sticos");
	            break;

	        }
	        if (numeroCodigo > 15 || numeroCodigo < 0) {
	            System.out.println("Comando Inv�lido");

	        }

	    }
    }

	}


