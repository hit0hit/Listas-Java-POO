package lista1;

import java.util.Scanner;

public class L4 {

	
		
		public static void main(String[] args) {
			
			int matricula , horas;
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Informe a matrícula do Funcionário: ");
			matricula = entrada.nextInt();
			System.out.println("Informe a quantidade de horas-extras trabalhadas: ");
			horas = entrada.nextInt();
			
			double salarioM = 788;
			double horaExtraT = 10;
			double salarioHoraT = salarioM + (horas*horaExtraT);
			double salarioB = (3 * salarioM) + salarioHoraT;
			double descInss = salarioB * 0.88;
			double descImpDeRenda = descInss * 0.80;
			
			System.out.printf("Salário hora extra: %.2f.\n",salarioHoraT);
			System.out.printf("Salário bruto: %.2f.\n",salarioB);
			
			if(salarioB> 1500)
			{
				System.out.printf("Com o desconto do INSS: %.2f.\n", descInss);
				
				if(salarioB > 2000)
				{
					System.out.printf("Com o desconto do IMPOSTO DE RENDA: %.2f.\n", descImpDeRenda);
				}
			}
			else 
			{
				System.out.printf("Seu salário não tem descontos!\n");
			}
			entrada.close();
		}

		

	}


