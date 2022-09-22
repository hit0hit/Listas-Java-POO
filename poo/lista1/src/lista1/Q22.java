package lista1;

import java.util.Random;

public class Q22 {

	public static void main(String[] args) {
		Random num = new Random();
		int vetor[] = new int[10];
		
		
		
		for (int p=0; p<10; p++) {
		      
			vetor[p] = (int) (1+ (Math.random()*50));
			System.out.println(""+ vetor[p]);
		
		}
		System.out.println("\n\n");
		
		for (int p=0; p<10; p++) {
			if(vetor[p] > 25) {
				System.out.println("o vetor==> "+vetor[p]+" e maior que 25 "+" essa e a posição do vetor==> "+p);
		}else {
			
			System.out.println("o vetor==> "+vetor[p]+" e menor que 25 "+" essa e a posição do vetor==> "+p);
		}
		

	}
	}
	}
