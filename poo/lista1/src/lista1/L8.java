package lista1;

import java.util.Scanner;

public class L8 {

	public static void main(String[] args) {
		{
	        Scanner entrada = new Scanner(System.in);
	        double x, y, f;
	        int codigo;

	        System.out.println("Informe X: ");
	        x = entrada.nextDouble();
	        System.out.println("Informe Y: ");
	        y = entrada.nextDouble();
	        System.out.println("Informe o código da equação:");
	        codigo = entrada.nextInt();

	        switch (codigo) {
	        case 1:
	            f = (Math.sqrt(Math.pow(x, 3) + x * 2 * y - x) / Math.pow(y, 2));
	            System.out.println("Resultado: " + f);
	            break;
	        case 2:
	            f = (Math.sqrt(Math.pow(x + y, 3) + Math.pow(x - y, 3) / x * y));
	            System.out.println("Resultado: " + f);
	            break;
	        case 3:
	            f = (2 * x + (Math.sqrt(x * y)));
	            System.out.println("Resultado: " + f);
	            break;
	        case 4:
	            f = Math.sin(x) + Math.cos(y);
	            System.out.println("Resultado: " + f);
	            break;
	        }

	    }

	}

}
