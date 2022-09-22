package lista1;

import java.util.Random;

public class Q21 {

	public static void main(String[] args) {
		Random num = new Random();
		float vetor[] = new float[10];
		
		
		
		for (int p=0; p<10; p++) {
		      
			vetor[p] = (int) (1+ (Math.random()*20));
			System.out.println(""+ vetor[p]);
		
		}
		System.out.println("\n\n");
		
		for (int p=0; p<10; p++) {
			vetor[p]=(float) Math.sqrt(vetor[p]);
			vetor[4]=(float) -1;
			float veto=vetor[p];
			if(veto <= 0) {
				System.out.println("numero menor que 0"+veto);
		}else {
			
			System.out.println(""+ vetor[p]);
		}
		
		
			
		}

	}

}
