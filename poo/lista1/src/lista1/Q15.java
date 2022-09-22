package lista1;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		{
	        int n = 1, saque = 0, valor = 0;
	        float saldo = 0, deposito = 0;

	        do {

	            Scanner entrada = new Scanner(System.in);
	            System.out.println("|>Selecione a opção: ");
	            Scanner scanner = new Scanner(System.in);
	            char value = scanner.next().charAt(0);


	            switch (value) {
	            case 'a':
	                System.out.println("|>Saldo: " + saldo + " reaisS");
	                break;
	            case 'b':
	                System.out.println("|>Qual o valor do saque? ");
	                saque = entrada.nextInt();
	                saldo -= saque;
	                System.out.println("|>Saque de " + saque + " reais realizado, saldo restante: " + saldo + " Reais!");
	                break;
	            case 'c':
	                System.out.println("|>Informe o valor do Depósito:");
	                deposito = entrada.nextFloat();
	                saldo = deposito;
	                break;
	            case 'd':
	                n = 0;
	            }
	        } while (n != 0);
	    }
	}

}
