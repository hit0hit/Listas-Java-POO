package lista1;

import java.util.Scanner;

public class L10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        System.out.println("digite o X");
        int X = entrada.nextInt();
        System.out.println("digite o inicio");
        int I = entrada.nextInt();
        System.out.println("digite o fim");
        int F = entrada.nextInt();
       
        for (int T=I;T<F;T++) {
        	
        	
        	if(T > I && T < F) {
        	
        	if(T % X == 0){
        		
        		System.out.println("esse numero ==> " + T +" <== e divisivel por ==> " + X);
        		
        	}
        	
        	
        	
        	}
           
              
        }
        
    }

}

