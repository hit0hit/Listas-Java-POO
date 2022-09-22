package prova1;

import java.util.Scanner;
import java.util.Vector;

public class Ex4 {

	

	public static void main(String[] args) {
		
		Vector<Float> nota=new Vector<>();
		Vector<String> aluno=new Vector<>();
		int qant_aluno;
		String p,nome1 = null,nome2=null;
		float maior=0;
		float menor=10000000;
		Scanner entrad=new Scanner(System.in);
		int cont1=0,cont2=0,cont3=0;
		float n,n1,n2,media_classe=0;
		
			
		System.out.println("digite quantos aluno sao ==>");
		qant_aluno = entrad.nextInt();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		for(int i=0; i<qant_aluno;i++) {
			
			
		Scanner entrada=new Scanner(System.in);
		
			System.out.println("digite o nome do " + i+" aluno");
			
			
			p = entrada.nextLine();
			aluno.add(i,p);
			System.out.println("nome salvo "  + aluno);
		}
		int d=qant_aluno,cont=0;
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		
		do {	
			
			
			do {
		System.out.println("digite a primeira nota do aluno==> "+aluno.get(cont));
		n1 = entrad.nextInt();
		if (n1 > 10 || n1 < 0) {
			System.out.printf("Digite uma nota válida.\n");
		}
			}while(n1 > 10 || n1 < 0);
			
			
			
			do {
				System.out.println("digite a segunda nota do aluno==> "+aluno.get(cont));
				n2 = entrad.nextInt();
				if (n2 > 10 || n2 < 0) {
					System.out.printf("Digite uma nota válida.\n");
				}
					}while(n2 > 10 || n2 < 0);
			
			
			
			
			n=(n1+n2)/2;
			media_classe += (n/qant_aluno);
			nota.add(cont,n);
			System.out.println("media do aluno"  + nota+"\n\n");
			d--;
			cont++;
		}while(d!=0);
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		
		for(int s=0; s<qant_aluno;s++) { 
			if(nota.get(s)<=4) {
				System.out.println("nome do aluno==> "+aluno.get(s)+ "\tnota==> " +nota.get(s) + "\tReprovado");
			
			cont1++;
					
		}
			if(nota.get(s)>4&& nota.get(s)<=6) {
				System.out.println("nome do aluno==> "+aluno.get(s)+ "\tnota==> " +nota.get(s)+ "\tExame");
				
				cont2++;
			}
		
			if(nota.get(s)>6) {
				System.out.println("nome do aluno==> "+aluno.get(s)+ "\tnota==> " +nota.get(s)+"\tAprovado");
				cont3++;
			}
			}
		
		for(int i = 0; i < qant_aluno; i++){
			if(nota.get(i) > maior){ 
				maior = nota.get(i);
				nome1= aluno.get(i);
			}}
	
		for (int i = 0; i < qant_aluno; i++) {
			if(nota.get(i) < menor){
			 menor = nota.get(i);
			 nome2= aluno.get(i);
			}}
		System.out.println("\nC) total de aluno==> "+ qant_aluno);
		System.out.println("D) \ntotal de aluno aprovado==> "+cont3+"\ntotal de aluno exame==> "+cont2+"\ntotal de aluno reprovado==> "+cont1);
		System.out.println("E) media da classe==> " + media_classe);
		System.out.println("F) maior nota ea do aluno==> " + nome1 +" com "+ maior);
		System.out.println("F) menor nota ea do aluno==> " + nome2 +" com "+ menor);
		
		entrad.close();
}
}
