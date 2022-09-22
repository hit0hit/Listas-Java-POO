package lista1;

import java.util.Scanner;

public class L1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero inteiro");
		int numero1 = entrada.nextInt(); 
		System.out.println("digite um numero inteiro");
		int numero2 = entrada.nextInt();
		int resp=numero1/numero2;
		if(resp != 0) {
			System.out.println("e um numero inteiro==>"+resp);
		}else {
			System.out.println("nao e inteiro");
		}
		
	}

}
