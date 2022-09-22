package lista1;
import java.util.Iterator;
import java.util.Scanner;

public class L19 {

	public static void main(String[] args) {
	
		{{
	        int linha = 1, linhas = 0, coluna = 1;
	        System.out.println("Determina a quantidade de linhas:");
	        linhas = new Scanner(System.in).nextInt();
	        while (linha <= linhas) {
	            while (coluna <= linha) {
	                System.out.print("*");
	                coluna++;
	            }
	            coluna = 1;
	            System.out.println("");
	            linha++;

	        }
	        linha = linhas -1;
	        coluna = 1;
	        
	        do {
	         if(linhas >= linha) {
	            while (coluna <= linha) {
	                System.out.print("*");
	                coluna++;
	            }
	            coluna = 1;
	            System.out.println("");
	            linha--;
	    }
	        }while(linha!=0);
		}

	    }
	}

}
