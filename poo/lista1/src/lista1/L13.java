package lista1;

import java.util.Scanner;

public class L13 {

	public static void main(String[] args) {
		
		
		int senha=0,con;
		do {
			
			Scanner entrada=new Scanner(System.in);
			
			
			do {
				System.out.println("digite uma nova senha");
				senha=entrada.nextInt();
				
			System.out.println("sua senha e "+senha +"\nconfirme sua senha==> 1\nalterar senha==> 2\n");
			con=entrada.nextInt();
			
			}while(con != 1);
			
			
			
			
			do {
			System.out.println("digite sua senha");
			con=entrada.nextInt();
			
			if(con == senha) {
				
				System.out.println("\n\nsenha correta\nbem vindo ao sistema ");
				con=0;
			}else {
				
				System.out.println("senha errada digite de novo\n");
				
			}
			}while(con != 0);
			senha = 0;
		}while(senha != 0);

	}

}
