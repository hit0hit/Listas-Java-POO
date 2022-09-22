package prova1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		{

	        Scanner entrada = new Scanner(System.in);
	        double a, b, c, x0, y0;
	        double d,p, s;

	        System.out.println("Informe o valor de x0: ");
	        x0 = entrada.nextDouble();
	        System.out.println("Informe o valor de y0: ");
	        y0 = entrada.nextDouble();
	        System.out.println("Informe o valor de a: ");
	        a = entrada.nextDouble();
	        System.out.println("Informe o valor de b: ");
	        b = entrada.nextDouble();
	        System.out.println("Informe o valor de c: ");
	        c = entrada.nextDouble();

	        d = a * x0 + b * y0 + c / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	        System.out.println("Resultado: " + d);
entrada.close();
	    }

	}
}
