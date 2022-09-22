package exercicio5;

import java.util.Scanner;



public class PrincipalEstoque {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		 System.out.println("Quantos produtos deseja colocar na fatura?");
	       
	        var produtos = new Estoque[3];
	        
	        for(int i=0;i<produtos.length;i++){
	            produtos[i] = new Estoque();
	            
	           
	            produtos[i].mudarNome(input.next());;
	            
	            
	        }
	}

}
