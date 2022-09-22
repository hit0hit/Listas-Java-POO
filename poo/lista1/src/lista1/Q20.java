package lista1;

import java.util.Random;
import java.util.Vector;

public class Q20 {

	public static void main(String[] args) {
		
		Random num = new Random();
		int vetor[] = new int[10];
		
		
		
		for (int p=0; p<10; p++) {
		      
			vetor[p] = (int) (1+ (Math.random()*100));
			System.out.println(""+ vetor[p]);
		
		}
		int menor=vetor[0], maior=vetor[0],veto=0,l=0;
		 for (int i=0; i<10; i++) {
		     
		      if (vetor[i] < menor)
		         menor = vetor[i];
		    

		      if (vetor[i] > maior)
		         maior = vetor[i];
		    }
		 for (int g=0; g<10; g++) {
			 
			 if (vetor[g] == menor) {
				 veto=g+1;
			 }
			
		 }
		 int v=0;
		 for (int d=0;d<10; d++) {
			 
			 if (vetor[d] == maior) {
				 v=d+1;
			 }
			 
		 }
		 System.out.println("menor ==> "+ menor +"vetor==> "+ veto);
		 System.out.println("maior ==> "+ maior+" vetor==> "+v);
			
		}
		
		
		
	}


