package lista1;

import java.util.Scanner;

public class L12 {

	public static void main(String[] args) {
		
		int s=1;
		do {
			Scanner entrada=new Scanner(System.in);
			System.out.println("digite o nome do aluno");
			String nome = entrada.next();
			System.out.println("digite a nota A");
			int A = entrada.nextInt();
			System.out.println("digite a nota B");
			int B = entrada.nextInt();
			
			
			int resul = A+B/2;
			
			
			
			System.out.println("o aluno "+ nome +"tem uma media de ==> "+resul);
			
			
			
			
			System.out.println("continuar sim=1 ou nao=0");
			s = entrada.nextInt();
			
			
			
		}while(s != 0);

	}

}
