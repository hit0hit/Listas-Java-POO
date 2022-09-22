package lista1;

import java.util.Scanner;

public class L2 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("qual a sua idade?");
		int idade = entrada.nextInt();
		
		if(idade > 16 && idade < 17) {
			System.out.println("eleitor facultativo: sua idade ==>"+idade); 
			
		}if(idade > 18 && idade < 65) {
			System.out.println("eleitor obrigatorio: sua idade ==>"+idade); 
			
		}if(idade > 65) {
			System.out.println("eleitor dispensado: sua idade ==>"+idade); 
			
		}
	}

}
