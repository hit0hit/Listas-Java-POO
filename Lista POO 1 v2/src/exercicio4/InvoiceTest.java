package exercicio4;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	       
	        System.out.println("Quantos produtos deseja colocar na fatura?");
	        int numeroDeProdutos=input.nextInt();
	        Invoice produtos[] = new Invoice[numeroDeProdutos];
	        double total = 0;
	       
	        for(int i=0;i<produtos.length;i++){
	            produtos[i] = new Invoice();
	            produtos[i].setNumero(i+1);
	            System.out.println("Produto: " + (i+1));
	            System.out.println("Insira um descrição: ");
	            String descricao = input.next();
	            produtos[i].setDescricao(descricao);
	            System.out.println("Insira o preço: ");
	            produtos[i].setPreco(input.nextDouble());
	            System.out.println("Insira a quantidade: ");
	            produtos[i].setQuantidade(input.nextInt());
	            total+=produtos[i].getInvoiceAmount();
	        }
	       
	        for(Invoice element:produtos){
	            System.out.println("Produto de numero: " + element.getNumero());
	            System.out.println("Descrição: " + element.getDescricao());
	            System.out.println("Quantidade: " + element.getQuantidade());
	            System.out.println("Preço: " + element.getPreco() + "\n");
	        }
	       
	        System.out.println("Total da fatura: " + total);

	}

}
