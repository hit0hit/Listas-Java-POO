package lista1;

import java.util.Scanner;

public class L7 {

	public static void main(String[] args) {
		
		{
	        Scanner entrada = new Scanner(System.in);

	        double salario, salarioAumento, valorDoAumento;
	        int codigoUsuario;

	        System.out.println("Informe o codigo de Usu�rio: ");
	        codigoUsuario = entrada.nextInt();
	        System.out.println("Informe o sal�rio do Usu�rio: ");
	        salario = entrada.nextInt();

	        switch (codigoUsuario) {
	        case 1:
	            System.out.println("Escritu�rio");
	            salarioAumento = salario * 0.5;
	            System.out.println("O usuario " + codigoUsuario + " tem sal�rio base de " + salario + " com aumento de "
	                    + salarioAumento + " reias");
	            break;
	        case 2:
	            System.out.println("Secret�rio");
	            salarioAumento = salario * 0.35;
	            System.out.println("O usuario " + codigoUsuario + " tem sal�rio base de " + salario + " com aumento de "
	                    + salarioAumento + " reias");
	            break;
	        case 3:
	            System.out.println("Caixa");
	            salarioAumento = salario * 0.2;
	            System.out.println("O usuario " + codigoUsuario + " tem sal�rio base de " + salario + " com aumento de "
	                    + salarioAumento + " reias");
	            break;
	        case 4:
	            System.out.println("Gerente");
	            salarioAumento = salario * 0.1;
	            System.out.println("O usuario " + codigoUsuario + " tem sal�rio base de " + salario + " com aumento de "
	                    + salarioAumento + " reias");
	            break;
	        case 5:
	            System.out.println("Diretor");
	            salarioAumento = salario * 0;
	            System.out.println("O usuario " + codigoUsuario + " tem sal�rio base de " + salario + " com aumento de "
	                    + salarioAumento + " reias");
	            break;

	        }
	        if (codigoUsuario > 5 || codigoUsuario < 1) {
	            System.out.println("C�digo Inv�lido");
	        }
	    }
	}

}
