package lista1;

import java.util.Scanner;
import java.util.Vector;

public class L14 {

	public static void main(String[] args) {
		
		Vector<Float> nota=new Vector<>();
		Vector<String> aluno=new Vector<>();
		int qant_aluno;
		String p;
		
		
		
		Scanner entrad=new Scanner(System.in);
		
		
		int cont1=0,cont2=0,cont3=0;
		float n,n1,n2,media_classe=0;
		
			
		System.out.println("digite quantos aluno sao");
		qant_aluno = entrad.nextInt();
		
		for(int i=0; i<qant_aluno;i++) {
			
			
		Scanner entrada=new Scanner(System.in);
		
			System.out.println("digite o nome dos aluno");
			
			
			p = entrada.nextLine();
			aluno.add(i,p);
			System.out.println("aaaa  "  + aluno);
		}
		
		
		
		
		for(int s=0; s<qant_aluno;s++) { 
			
			
			System.out.println("digite o NOTA dos aluno");
			
			n1 = entrad.nextInt();
System.out.println("digite o NOTA dos aluno");
			
			n2 = entrad.nextInt();
			n=(n1+n2)/2;
			media_classe += (n/qant_aluno);
			nota.add(s,n);
			System.out.println("d  "  + nota);
		
		
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		
		for(int s=0; s<qant_aluno;s++) { 
			if(nota.get(s)<=3) {
				System.out.println("nome do aluno==> "+aluno.get(s)+ "\tnota==> " +nota.get(s) + "\tReprovado");
			
			cont1++;
					
		}
			if(nota.get(s)>3&& nota.get(s)<=7) {
				System.out.println("nome do aluno==> "+aluno.get(s)+ "\tnota==> " +nota.get(s)+ "\tExame");
				
				cont2++;
			}
		
			if(nota.get(s)>7) {
				System.out.println("nome do aluno==> "+aluno.get(s)+ "\tnota==> " +nota.get(s)+"\tAprovado");
				cont3++;
			}
			}
		System.out.println("\ntotal de aluno==> "+ qant_aluno);
		System.out.println("total de aluno aprovado==> "+cont3+"\ntotal de aluno exame==> "+cont2+"\ntotal de aluno reprovado==> "+cont1);
		System.out.println("media da classe==> " + media_classe);
		
		
		entrad.close();
}
}
