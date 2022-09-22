package lista1;

import java.util.Scanner;

public class L9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        System.out.println("digite o X");
        int X = entrada.nextInt();
        System.out.println("digite o Y");
        int Y = entrada.nextInt();
        int res = 1;
        while (Y != 0) {
            res = res * X;
           
           Y--;
        }
        System.out.println("Res =  " + res);
    }

}
