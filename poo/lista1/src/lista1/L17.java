package lista1;

import java.util.Scanner;

public class L17 {

	public static void main(String[] args) {
		{
	        Scanner entrada = new Scanner(System.in);
	        int codigoProduto, opc;
	        double preco = 0, quantidade;
	        do {
	System.out.println("|>Tabela:  Valor => "+preco+" \n|>1-Cachorro quente \n|>2-Hamburguer \n|>3-Cheeserburguer \n|>4-Eggcheeseburguer \n|>5-Refrigerante \n|>6-Encerrar");
	            codigoProduto = entrada.nextInt();

	            switch (codigoProduto) {
	            case 1:
	                System.out.println("Cachorro quente");
	                quantidade = 1.50;
	                preco += quantidade;
	                break;
	            case 2:
	                System.out.println("Hamburguer");
	                quantidade = 2.00;
	                preco += quantidade;
	                break;
	            case 3:
	                System.out.println("Cheeserburguer");
	                quantidade = 2.50;
	                preco += quantidade;
	                break;
	            case 4:
	                System.out.println("Eggcheeseburguer");
	                quantidade = 3.00;
	                preco += quantidade;
	                break;
	            case 5:
	                System.out.println("Refrigerante");
	                quantidade = 1.50;
	                preco += quantidade;
	                break;
	            case 6:
	                codigoProduto = 0;
	                System.out.println("Encerrado:");
	                System.out.println("Preco total do pedido " + preco +" reais!\n");

	            }
	        } while (codigoProduto != 0);

	    }



	}

}
